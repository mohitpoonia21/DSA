class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        int start = 1; // minimum possible day 1 flower ko bloom hone k liye
        int max = 0;
        for(int i =0;i<n;i++){
            if(bloomDay[i]>max){
                max = bloomDay[i];
            }
        }
        int end = max; // jyaada se jyaada din ek flower ko bloom hone k liye array ka max day hi hoga
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2; // current day
            int bouquet = 0;
            int consecutive = 0;

            for(int i =0;i<n;i++){
                if(bloomDay[i]<=mid){ // agr array ka ith flower current day ya usse phle bloom ho chuka h toh consecutive ko + krenge
                    consecutive++;
                }
                else{ //agr bloom nahi hua toh 0 krdenge
                    consecutive = 0;
                }

                if(consecutive == k){ // kyonki hume consecutive flowers hi use krne h toh dekhenge agr consecutive jitne flower bloom huye vo barabr h jitne flowers hume chiye bouquet bnane k liye toh bouquet ko plus krdenge
                    bouquet++;
                    consecutive = 0;
                }
            }

            if(bouquet>=m){ //agr bouquet required bouquet se jyaada ya barabr h mtlb iss mid jo days ko represent kr rha h isme hum required bouquet bna skte h toh ans ko store krlenge aur mid ko left move krenge aur dekhenge kya hum isse km din m bhi required bouquet bna skte h ya nahi
                ans = mid;
                end = mid-1;
            }
            else{ // agr bouquet required bouquet se km h mtlb mid tk itne flowers bloom nahi huye the ki hum required bouquet bna paaye islie mid ko right move krenge
                start = mid+1;
            }
        }
        return ans;
        
    }
}