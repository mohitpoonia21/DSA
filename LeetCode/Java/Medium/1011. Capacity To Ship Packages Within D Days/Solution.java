class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n = weights.length;
        int max =0;
        for(int i =0;i<n;i++){ // array ka max weight nikalenge 
            if(weights[i]>max){
                max = weights[i];
            }
        }

        int start = max;
        int sum=0;

        for(int i =0;i<n;i++){ // end m saare weights ka sum nikalenge agr 1 hi din m sbko ship krna hua toh saare package ek din m le jaane hoge toh capacity wahi hogi
            sum += weights[i];
        }
        int end = sum;
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2; // current capacity
            int totalDays = 1; 
            int currentWeight = 0;

            for(int i = 0;i<n;i++){

                if(weights[i]+currentWeight<=mid){ //jitna hoskta h 1 din m utna allot krdenge
                    currentWeight+= weights[i];
                }
                else{ // agr nahi hoskta toh days ko bdhyange aur jiss weight pr h usko current weight bna denge taaki agli br se wahi weight allot ho next day p
                    totalDays++;
                    currentWeight = weights[i];
                }
            }
            if(totalDays<=days){ // iska mtlb h current capacity m sbb package ship hojaynge toh answer ko store krlenge aur left move krke dekhenge agr isse km capacity m bhi saare package ship hoskte h kya 
                ans = mid;
                end = mid-1;
            }
            else{ // iska mtlb iss capacity m saare package ship nhi hoskte islie right move krenge aur capacity ko increase krenge
                start = mid+1;
            }
        }
        return ans;  
    }
}
