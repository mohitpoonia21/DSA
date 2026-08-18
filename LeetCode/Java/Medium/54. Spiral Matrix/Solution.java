class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;  // row aur column ka size
        int n = matrix[0].length;

        int startingRow = 0;
        int endingRow= m-1;

        int startingCol =0;
        int endingCol = n-1;

        while(startingRow <= endingRow && startingCol <= endingCol){ // stopping condition
            // LOOP 1 left se right chlega row wise

            for(int col = startingCol;col<=endingCol;col++){
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            // LOOP 2 top se bottom chlega col wise

            for(int row = startingRow;row<=endingRow;row++){
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            // LOOP 3 right se left chlega row wise

            if(startingRow<=endingRow){ // check krenge agr 1 bhi row h print krne k liye
                for(int col = endingCol; col>=startingCol;col--){
                result.add(matrix[endingRow][col]);
            }
            endingRow--;
            }

            // LOOP 4 bottom to top column wise

            if(startingCol<=endingCol){ // check krenge agr 1 bhi column h print krne k liye
                for(int row = endingRow;row>= startingRow;row--){
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }

            
        }
        return result;
        
    }
}