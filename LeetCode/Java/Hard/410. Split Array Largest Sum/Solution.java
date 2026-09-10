class Solution {
    public int splitArray(int[] nums, int k) {

        int n = nums.length;
        int max = 0; 
        for(int i =0;i<n;i++){ 
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int start = max; // minimum array ka max element hoga

        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int end = sum; // end array ka sum hoga agr k ki value 1 huyi toh ek br m sbb ko lena hoga
        int ans = -1;

        while(start<=end){

            int mid = start + (end -start)/2;
            int arraySize = 1; // subarray shuruat m 1 hoga 
            int currentSum = 0; 

            for(int i = 0;i<n;i++){
                if(currentSum + nums[i]<=mid){ // current sum aur array ka current element ka sum agr mid se chhota h toh current sum m usse add krdenge
                    currentSum += nums[i]; 
                }
                else{ // vrna array size ko bdha denge aur currentSum array ka current element hojayga kuki pehle wali values humne phle wale array m use krli
                    arraySize++; 
                    currentSum = nums[i];
                    if(arraySize>k){ // agr arraysize k se bada hojata h toh loop se bahar aajyange
                        break;
                    }
                }
            }
            if(arraySize<=k){ // agr required subarray k se chhota ya barabr h mtlb current mid m answer nikal gya toh isko store krlenge lekin left move krke check krenge agr isse km mid m bhi answer nikal skta h kya kyonki hume minimum of max chahiye
                ans = mid;
                end = mid-1;
            }
            else{ // agr subarray k se jyaada hogye toh right move krenge aur mid ko increase krenge
                start = mid+1;
            }
        }

        return ans;
        
    }
}
