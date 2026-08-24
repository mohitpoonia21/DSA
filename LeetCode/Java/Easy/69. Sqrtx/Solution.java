class Solution {
    public int mySqrt(int x) {

        int start = 1; // 1 se start krenge taaki divide by zero error na aaye
        int end = x;
        int ans = -1;


        if(x==0){ // 0 wale case ko alg se handle krenge
            return 0;
        }

        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid == x/mid){  // mid*mid islie nahi krenge taaki integer overflow na ho
                return mid;
            }
            else if(mid>x/mid){ // agr mid * mid x se bada h toh left move krenge because vo answer nahi ho skta
                end = mid-1;
            }
            else{ // agr mid * mid x se chhota h toh shyd vo potential answer ho usko store krlenge aur right m move krke check krenge agr koi aur number exist krta h jo sqrt ho skta h
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
        
    }
}