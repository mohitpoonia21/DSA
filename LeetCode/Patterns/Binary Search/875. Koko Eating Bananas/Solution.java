class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int start =1;
        int max = 0;
        for(int i =0;i<n;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        int end = max ;
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            int totalHours = 0;

            for(int i = 0;i<n;i++){
                int hours = (piles[i] + mid - 1) / mid;
                totalHours = totalHours + hours;
            }
            int hours = 0;

            if(totalHours<=h){
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