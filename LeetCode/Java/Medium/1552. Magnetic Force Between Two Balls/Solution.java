class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int n = position.length;

        int start =1;
        int max = 0;

        for(int i =0;i<n;i++){
            if(position[i]>max){
                max = position[i];
            }
        }
        int end = max;
        int ans = -1;


        while(start<=end){
            int mid = start + (end - start)/2;
            int balls = 1;
            int lastPosition = 0;

            for(int i =0;i<n;i++){
                if(position[i]-position[lastPosition]>=mid){
                    lastPosition = i;
                    balls++; 
                }
                else{
                    continue;
                }

            }
            if(balls>=m){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
        
    }
}