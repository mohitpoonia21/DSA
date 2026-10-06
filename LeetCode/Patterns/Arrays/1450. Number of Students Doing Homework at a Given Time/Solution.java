class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int n1 = startTime.length;

        int count = 0;

        for(int i = 0;i<n1;i++){
            if(startTime[i]<=queryTime && queryTime<=endTime[i]){
                    count++;
            }

        }
        return count;
        
    }
}