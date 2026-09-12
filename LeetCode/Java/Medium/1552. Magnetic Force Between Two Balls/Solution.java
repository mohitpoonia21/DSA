class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int n = position.length;

        int start =1; // // start ko 1 rakhenge kyunki positions distinct hain, toh minimum possible distance 1 hoga
        int end = position[n-1] - position[0]; // end ko last - first rkhenge agr 1 ball 1st position p hua aur dusra last position p toh wahi max possible min h
        int ans = -1;


        while(start<=end){
            int mid = start + (end - start)/2; // minimum distance jisko abhi test kr rhe h
            int balls = 1; // 1st ball ko aate hi 0 index p place krdenge
            int lastPosition = 0;

            for(int i =1;i<n;i++){ // 1 se start krenge becuase 0 index p alr 1 ball placed h
                if(position[i]-position[lastPosition]>=mid){ // agr current - last ka distance minimum distance se bada ya barabr hua toh udhr ball place krdenge
                    lastPosition = i; // abb  current position last position bnjaygi
                    balls++; 
                }
                else{ // agr current - last chhota hua minimum distance se toh skip krdenge
                    continue;
                }

            }
            if(balls>=m){ // agr balls jyaada ya barabr huyi m se toh iss minimum distance(mid) m saari balls place hogyi toh iss possible answer ko store krlenge aur right move krenge aur dekhenge agr isse jyaada minimum distance m saari balls place hogi kya kuki hume maximum of min distance chiye
                ans = mid;
                start = mid+1;
            }
            else{ // agr saari balls place nahi hogi toh minmum distance jyaada h isme saari balls place nahi hopayi islie left move krenge 
                end = mid-1;
            }
        }
        return ans;
        
    }
}
