class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;

        for(int i =0;i<grid.length;i++){
            int start = 0;
            int end = grid[i].length -1;

            while(start<=end){

              int mid = start + (end-start)/2;
              if(grid[i][mid]<0){ // agr 0 se chhota h mtlb negative no h toh left move krke check krenge agr usse phle wale kisi index pr bhi negative no h kya islie left move krenge kyonki non increasing order m sorted h
                end = mid-1;
              }
              else{  //agr 0 se bada ya equal h mtlb positive no p h islie right move krenge kyonki non increasing order m sorted h
                start = mid+1;
              } 
            }
            // yaha p aakr 1 row ka binary search complete hojayga
            // uss row k negatives ka count calculate krenge

            count += grid[i].length-start; // start basically first negative no ka index btata h aur start se end tak saare no negative h toh row ki length se start ka index minus krdenge toh negative aajyange
        }
        return count;
    }
}