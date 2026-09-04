class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int start =1; // minimum speed
        int max = 0;
        for(int i =0;i<n;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        int end = max; // array ka largest element
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2; // mid basically speed h banana khaane ki
            long totalHours = 0; // har baar totalHours ko 0 krdenge each iteration k liye

            for(int i = 0;i<n;i++){
                int hours = (piles[i] + mid - 1) / mid; // kitne ghnte lgenge ek pile of banana khane m current speed yani mid se 
                totalHours = totalHours + hours; // saare ghnto ko add krlenge
            }

            if(totalHours<=h){ // agr totalHours km hai h se mtlb iss speed se saare banana koko kha legi toh iss possible answer ko store krlenge aur left move krke dekhenge agr isse km speed m bhi saare piles of banana kha skte h kya
                ans = mid;
                end = mid-1;
            }
            else{ // agr totalHours jyaada h mtlb speed km h mtlb mid km h toh right m move krenge
                start = mid+1;
            }
        }

        return ans;
        
    }
}