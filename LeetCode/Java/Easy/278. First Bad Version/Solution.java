/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(isBadVersion(mid)){ //agr mid bad version h toh uske left m check krenge usse chhota koi bad version h kya
                end = mid-1;
            }
            else{ // agr mid bad version nahi h toh right move krenge
                start = mid+1;
            }
        }
        return start;
        
    }
}