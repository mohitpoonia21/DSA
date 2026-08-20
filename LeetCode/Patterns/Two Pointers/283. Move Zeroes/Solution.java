class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int index =0;
        int count=0;
        int lastIndex = n-1;

        for(int i =0;i<n;i++){
            if(nums[i]!= 0) {
                nums[index] = nums[i];
                index++;
                count++;
            }
        for(int j = count;j<n;j++){
            nums[i] = 0;
        }
            
        }
        
    }
}