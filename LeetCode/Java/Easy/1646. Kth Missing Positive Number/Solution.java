class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = n-1;


        while(start<=end){
            int mid = start + (end-start)/2;

            int missing = arr[mid] - (mid+1); // mid ki value se mid ka index minus krlo jo result aayga utne hi missing no's honge

            if(missing < k){ // agr missing target se km h toh right move krenge
                start = mid+1;
            }
            else{  // agr missing target se jyaada ya barabr h toh left move krenge
                end = mid-1;
            }
        }
        return start+k;
    }
}