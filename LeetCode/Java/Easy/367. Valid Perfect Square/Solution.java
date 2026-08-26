class Solution {
    public boolean isPerfectSquare(int num) {

        int start = 0;
        int end = num;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(mid==num/mid){
                return true;
            }
            else if(mid>num/mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
        
    }
}