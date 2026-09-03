class Solution {
    public int arrangeCoins(int n) {

        int start =0;
        int end = n;

        while(start<=end){
            int mid = start + (end-start)/2;

            long coinsRequired = (long)mid * (mid+1)/2; // current mid k liye total kitne coins chiye staircase bnane k liye

            if(coinsRequired<=n){ // agr required coins given no se km h mtlb hoskta h aur bhi rows shyd add krskte h toh right move krke dekhenge
                start =mid+1;
            }
            else{ // agr coins required given no se jyaada h toh left move krenge
                end = mid-1;
            }
        }
        return start-1;
        
    }
}