class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for(int i = 0;i<n;i++){
            sum+= mat[i][i]; // primary diagonal
            sum+= mat[i][n-1-i]; // secondary diagonal
        }
        if(n%2==1){
            sum-= mat[n/2][n/2]; // agr odd hua toh diagonal 2 br add hogya tha islie 1 br minus krdenge
        }

        return sum;
        
    }
}