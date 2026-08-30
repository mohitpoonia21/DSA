class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int n = letters.length;
        int start = 0;
        int end = n-1;

        if(target>letters[n-1]){ //agr target last character se bada h mtlb usse bada chracter array m exist nahi krta toh first character return krdenge as per our problem statement
            return letters[0];
        }

        while(start<end){
            int mid = start + (end-start)/2;

            if(target>=letters[mid]){ // agr target bada ya barabar mid se toh right move krenge
                start = mid+1;
            }
            else{
                end = mid-1;  // agr target chhota h mid se toh left move krenge
            }
        }
        return letters[start]; // jis index p start hoga loop end hone pr ussi p target se badi value hogi
    }
}