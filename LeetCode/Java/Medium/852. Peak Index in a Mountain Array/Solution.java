class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;  // array ki length
        int start = 0;
        int end = n-1;
        int ans = 0;

        while(start<=end){ // jbb tk start end se chhota h loop chlega
            int mid = start + (end-start)/2; // mid calculate krenge

            if(arr[mid]<arr[mid+1]){ // jbb mid mid+1 se chhota h iska mtlb hum ascending order wale part m h mtlb left part m h aur isse bada answer iske right m hoga toh right m move krenge
                start = mid+1;
            }
            else{ // jbb mid mid+1 se bada h iska mtlb h hum right wale part m h mtlb descending wale part m h aur shyd potential answer p h islie mid ki value ko ans me store krlenge aur check krenge agr isse badi koi value exist kregi toh vo left me hogi kyonki hum descending wale part m islie left m move krenge
                ans=mid;
                end = mid-1;
            }
        }
        return ans;
        
    }
}
