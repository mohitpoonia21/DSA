class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int start =0; // for 1st occurence start and end index nikalenge
        int end = n-1;

        int first = -1;
        int last = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]==target){ // agr mid ki value same hogi usse store krlenge aur uske left m dhundenge agr koi usse phle bhi uss value ki occurence h ya nahi
                first = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){ // agr value target se chhoti h toh right move krna hoga 
                start = mid+1;
            }
            else{ // agr value target se badi h toh left move krna hoga
                end = mid-1;
            }
        }

        start = 0; // start aur end index ko reset krenge vrna second while loop m kbhi entry hi nahi ho paaygi last occurence ka index nikalne k liye
        end =n-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]==target){ //agr mid ki value same hogi usse store krlenge aur uske right m dhundenge agr koi uske baad bhi uss value ki occurence h ya nahi
                last = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){ // agr value target se chhoti h toh right move krna hoga 
                start = mid+1;
            }
            else{ // agr value target se badi h toh left move krna hoga
                end = mid-1;
            }

        }
        return new int[]{first,last}; // jb dono loop se bahar aajaynge agr target value array m present hogi toh vo array m return krdenge vrna default [-1,-1] return hojayga as per our problem statement
    }
}