class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int len = quantities.length;

        int start = 1; // minimum 1 product toh hoga hi per store

        int max = 0;
        for(int i = 0;i<len;i++){
            if(quantities[i]>max){
                max = quantities[i];
            }
        }

        int end = max; // jbb n 1 hoga toh max quantity ussi m store hogi
        int ans =-1;

        while(start<=end){
            int mid = start + (end-start)/2; //  maximum capacity per store

            int storesRequired = 0;

            for(int i =0;i<len;i++){ // kitne stores lgenge har product k liye agr mid capacity se store krenge
                storesRequired += (quantities[i] + mid-1)/mid; // ceil division 
                if(storesRequired>n){ // agr storesRequired jyaada h n se mtlb current capacity enough nahi h products ko store krne k liye
                    break;
                }
            }
            if(storesRequired<=n){ // agr stores required km ya barabr h n se mtlb current capacity se sbb products ko store krpaynge islie current ans ko store krlenge aur left move krke dekhenge agr isse km capacity m bhi products ko store krpaynge kya
                ans = mid;
                end = mid-1;
            }
            else{ // agr storesRequired jyaada h n se mtlb curent capacity se products ko store nahi krpaaynge islie right move krenge
                start = mid+1;
            }
        }
        return ans;
        
    }


}
