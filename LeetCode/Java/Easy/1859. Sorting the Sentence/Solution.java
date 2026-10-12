class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            int position = word.charAt(word.length() - 1) - '1';

            ans[position] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", ans);
        
    }
}