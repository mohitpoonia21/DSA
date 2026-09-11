class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int len = quantities.length;

        int start = 1;

        int max = 0;
        for(int i = 0;i<len;i++){
            if(quantities[i]>max){
                max = quantities[i];
            }
        }

        int end = max;
        int ans =-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            int storesRequired = 0;

            for(int i =0;i<len;i++){
                storesRequired += (quantities[i] + mid-1)/mid;
                if(storesRequired>n){
                    break;
                }
            }
            if(storesRequired<=n){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
        
    }


}