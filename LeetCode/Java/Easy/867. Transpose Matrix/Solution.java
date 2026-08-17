class Solution {
    public int[][] transpose(int[][] matrix) {

        //original Matrix k rows cols

        int ogRows = matrix.length;
        int ogCols = matrix[0].length;

        // nayi matrix k rows cols ulte honge ya interchanged jaise 2x3 k 3x2

        int newRows = ogCols;
        int newCols = ogRows;

        int ans[][] = new int[newRows][newCols]; // nayi array bnaynge ulte size ki

        // array ko traverse krenge aur bss jo original array k [i][j] index p h usko nayi array k[j][i] index p rkh denge aur array ko return krdenge

        for(int i = 0;i<ogRows;i++){
            for(int j =0;j<ogCols;j++){
                ans[j][i] = matrix[i][j]; // naye k [j][i] index pr puraane ka [i][j] store krdenge jisse transpose hojayga
            }
        }
        return ans;
    }
}