class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;  // array ki length
        int index =0; // index aur counter dono ka kaam krega

        for(int i =0;i<n;i++){
            if(nums[i]!= 0) { // jbb bhi zero nahi rhega ith index pr,  uski jagah array k 0th index se lekr aage tk vo value store krlenge jo uss index pr present hogi
                nums[index] = nums[i]; 
                index++; // index bhi aage bdh jaayga saath m counter ka kaam krega jisse pta chl jaayga kitne non zero elements h
            }
        }    
        for(int i = index;i<n;i++){ // non zero elements k bd k jitne bhi element h sbko zero krdenge
            nums[i] = 0;
        }
            
    }
}