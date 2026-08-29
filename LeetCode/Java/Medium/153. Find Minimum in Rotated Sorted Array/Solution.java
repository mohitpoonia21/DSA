class Solution {
    public int findMin(int[] nums) {

        int n = nums.length;
        int start = 0;
        int end = n-1;

        int ans =-1;

        if(nums[0]<nums[n-1]){
            return nums[0];
        }

        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]>=nums[n-1]){
                ans = mid+1;
                start= mid+1;
            }
            else{
                end = mid-1;
            }

       }
       return nums[ans];
       
    }
    
}