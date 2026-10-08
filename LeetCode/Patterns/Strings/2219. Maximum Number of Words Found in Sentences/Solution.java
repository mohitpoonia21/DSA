class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for(int i=0;i<sentences.length;i++){
            String[] words = sentences[i].split(" ");
            int length = words.length;

            if(length>max){
                max = length;
            }
        }
        return max;
        
    }
}