class Solution {
    public int largestAltitude(int[] gain) {

        int n = gain.length;
        int maxAlt = 0;
        int currGain = 0;

        for(int i = 0;i<n;i++){
            currGain += gain[i];

            if(currGain>maxAlt){
                maxAlt = currGain;
            }

        }
        return maxAlt;
        
    }
}