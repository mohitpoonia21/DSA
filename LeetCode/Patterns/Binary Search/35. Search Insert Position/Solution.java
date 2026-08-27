class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(nums[mid]==target){ // agr mid target k equal hoga toh usse return krdenge
                return mid;
            }
            else if(target>nums[mid]){ // agr target mid se bda h toh right move krenge
                start = mid+1;
            }
            else{ // agr target mid se chhota h toh left move krenge 
                end = mid-1;
            }
        }
        return start;  // agr target nahi milta h toh start index p uss taget ki desired position hogi usse return krdenge  
    }
}