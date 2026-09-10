class Solution {
    public int splitArray(int[] nums, int k) {

        int n = nums.length;
        int max = 0;
        for(int i =0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int start = max;

        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int end = sum;
        int ans = -1;

        while(start<=end){

            int mid = start + (end -start)/2;
            int arraySize = 1;
            int currentSum = 0;

            for(int i = 0;i<n;i++){
                if(currentSum + nums[i]<=mid){
                    currentSum += nums[i]; 
                }
                else{
                    arraySize++;
                    currentSum = nums[i];
                    if(arraySize>k){
                        break;
                    }
                }
            }
            if(arraySize<=k){
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