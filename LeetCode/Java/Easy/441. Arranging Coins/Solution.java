class Solution {
    public int arrangeCoins(int n) {

        int start =0;
        int end = n;

        while(start<=end){
            int mid = start + (end-start)/2;

            long coinsRequired = (long)mid * (mid+1)/2;

            if(coinsRequired<=n){
                start =mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return start-1;
        
    }
}