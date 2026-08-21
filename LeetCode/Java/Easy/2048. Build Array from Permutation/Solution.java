class Solution {
    public int[] buildArray(int[] nums) {

        int n = nums.length;
        int ans[] = new int[n]; // nayi array same size ki

        for(int i =0;i<n;i++){ // traverse
            ans[i]= nums[nums[i]]; // given logic se nayi array bnakr return krdenge
        }
        return ans;
        
    }
}