class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int start = 0;
        int end = n-1;
        
        while(start<=end){ 
            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                return mid;  // same hoga to return krdenge mid ka index
            }
            else if(target>nums[mid]){ // agr target mid ki value se bada h mtlb vo sorted array m right side hoga to right side move krenge
                start = mid+1;
            }
            else{  // agr target mid ki value se chhota h mtlb vo sorted array m left side hoga to left side move krenge
                end = mid-1;
            }
        }
        return -1; // agr target present nahi hoga toh -1 return krenge as per problem statement
    }
}