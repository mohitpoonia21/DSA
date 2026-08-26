class Solution {
    public boolean isPerfectSquare(int num) {

        int start = 1; // start ko 1 se start krenge taaki division by zero error na aaye
        int end = num;

        if(num==0){ // 0 wale case ko alg se handle krenge 
            return true;
        }

        while(start<=end){
            int mid = start +(end-start)/2;

            if(mid==num/mid && num % mid==0){ // jbb mid num k equal hoga tbb true return krenge aur saath m ye bhi check krna hoga unka remainder 0 ho vrna 5/2 ans 2 dega jo galat hojayga 
                return true;
            }
            else if(mid>num/mid){ // agr mid*mid ki value num se badi h toh left side move krenge 
                end = mid-1;
            }
            else{ // agr mid*mid ki value num se chhoti h toh right side move krenge 
                start = mid+1;
            }
        }
        return false; // agr mid*mid ki value kbhi num k barabar nahi hogi toh false return krenge 
        
    }
}