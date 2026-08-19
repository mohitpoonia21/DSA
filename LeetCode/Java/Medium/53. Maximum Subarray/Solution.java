class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;  //maxSum ko shuruwat m -infinity krdenge

        for(int i =0;i<n;i++){ // traverse krenge
            sum = sum + nums[i]; // sum store krenge
            if(sum>maxSum){ // maxSum ko update krenge agr sum usse bada hua toh
                maxSum = sum;
            }
            if(sum<0){ // ye case most important h agr sum ki value negative h toh usse phle k saare array elements ko ignore krdenge aur sum ko wps 0 set krdenge aur aage k subarray ka sum calculate krenge kyonki negative no ko add krke maximum sum nahi milega
                sum=0;
            }
        }

        return maxSum;
        
    }
}