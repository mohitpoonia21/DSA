class Solution {
    public int findMin(int[] nums) {

        int n = nums.length; // array ki length
        int start = 0;
        int end = n-1;

        while(start<end){

            int mid = start + (end-start)/2;

            if(nums[mid]>nums[n-1]){ // jbb array k mid ki value last value se badi h mtlb L1 m h islie right m move krenge
                start= mid+1;
            }
            else{ //jbb array k mid ki value last value se chhoti ya barabr h mtlb L2 m h toh left m move krenge
                end = mid;
            }
        }
       return nums[start]; 
    }  
}