class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(mid%2==1){ //mid ko even bnaynge kuki humne ek pattern notice kiya normal array m even index pr element ki first occurence hogi aur odd index pr second toh mid agr usse agle element k equal h mtlb yaha tk array normal h toh right move krenge vrna fir left move krenge
                mid--;
            }
            if(nums[mid]==nums[mid+1]){ // mid already even h aur hume pta h agr mid agr uske next element k equal h mtlb yaha tk array normal h islie right move krenge aur +2 islie krenge kuki puri pair check ho chuki h
                    start = mid+2;
            }
            else{ // agr mid uske next element k equal nahi h mtlb isse phle array m single element aa chuka h jisne sequence ko break kiya h islie left m check krenge
                    end = mid;
            }
        }
        return nums[start]; // usss single element ko return krenge 
    }
}