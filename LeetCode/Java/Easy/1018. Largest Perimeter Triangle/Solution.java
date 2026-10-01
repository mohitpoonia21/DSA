class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int ans = 0;
        int max = 0;

        for(int i =0;i<n-2;i++){
            if(nums[i]+nums[i+1]>nums[i+2]){
                ans = nums[i] + nums[i+1] + nums[i+2];
            }
            if(ans>max){
                max = ans;
            }
        }

        return max;
        
    }
}