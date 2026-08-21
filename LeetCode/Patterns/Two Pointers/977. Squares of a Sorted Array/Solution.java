class Solution {
    public int[] sortedSquares(int[] nums) {

        /*int n = nums.length;

        for(int i =0;i<n;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;*/

        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) { // phle se pta h sorted array h usko last se traverse krenge

            if (Math.abs(nums[left]) > Math.abs(nums[right])) { // ya to sbse badi value last m hogi ya fir sbse shuruvat m because square of negative bhi positive aayga aur sorted array h toh sbse badi negative value sbse left m hogi islie absolute values ko compare krenge
                ans[i] = nums[left] * nums[left];
                left++;
            } else {
                ans[i] = nums[right] * nums[right];
                right--;
            }
        }

        return ans;
    }
    
}