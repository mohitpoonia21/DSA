class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n = weights.length;
        int max =0;
        for(int i =0;i<n;i++){
            if(weights[i]>max){
                max = weights[i];
            }
        }

        int start = max;
        int sum=0;

        for(int i =0;i<n;i++){
            sum += weights[i];
        }
        int end = sum;
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            int totalDays = 1;
            int currentWeight = 0;

            for(int i = 0;i<n;i++){

                if(weights[i]+currentWeight<=mid){
                    currentWeight+= weights[i];
                }
                else{
                    totalDays++;
                    currentWeight = weights[i];
                }
            }
            if(totalDays<=days){
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