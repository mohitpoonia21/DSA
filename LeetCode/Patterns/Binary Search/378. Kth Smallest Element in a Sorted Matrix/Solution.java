class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        int start = matrix[0][0];
        int end = matrix[n-1][n-1];

        if(k==1){
            return start;
        }

        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            int count = 0;
            int row = 0;

            for(int i =0;i<n;i++){
                int s = 0;
                int e = n-1;

                while(s<=e){
                    int middle = s + (e-s)/2;

                    if(matrix[i][middle]<=mid){
                        s = middle+1;
                    }
                    else{
                         e = middle-1;
                    }
                }
                count += s;   
                 
            }

            if(count>=k){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;

            }
        }
        return ans;

        
    }
}