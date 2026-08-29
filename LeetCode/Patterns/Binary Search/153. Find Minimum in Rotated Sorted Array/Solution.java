class Solution {
    public int findMin(int[] nums) {

        int n = nums.length; // array ki length

        if(nums[0]<nums[n-1] || n==1){ // agr array rotated sorted na ho ya fir 1 hi element ho array mai toh array ka phla element hi sbse chhota hoga toh sidha usse hi return krdenge
            return nums[0];
        }

        int start = 0;
        int end = n-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid]>=nums[n-1]){ // jbb array k mid ki value last value se badi ya barabar h mtlb L1 m h toh potenital answer ko store krlenge aur chceck krenge agr usse badi koi value bhi h toh islie right m move krenge
                start= mid+1;
            }
            else{ //jbb array k mid ki value last value se chhoti h mtlb L2 m h toh left m move krenge
                end = mid-1;
            }
       }
       return nums[start]; 
    }  
}