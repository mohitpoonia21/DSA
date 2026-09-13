class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        int start = matrix[0][0]; // sorted matrix h toh sbse chhota array ka 1st element hoga
        int end = matrix[n-1][n-1]; // similarly sbse bada last hoga

        if(k==1){ // base case agr 1st smallest puccha h toh start hi answer hoga 
            return start;
        }

        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2; // element jisse chhote ya barabr elements hum check krenge

            int count = 0;

            for(int i =0;i<n;i++){ // har row p traverse krenge
                int s = 0;
                int e = n-1;

                while(s<=e){ // binary search ko use krenge check krne k liye uss row m kitne elements mid se chhote ya barabr h 
                    int middle = s + (e-s)/2;

                    if(matrix[i][middle]<=mid){ // current row k middle element ko check krenge agr mid se chhota ya barabr  h, iska mtlb left wale sbhi chhote ya barabr h islie right move krenge
                        s = middle+1;
                    }
                    else{
                         e = middle-1;
                    }
                }
                count += s;   // while loop se bahar aane k bd count m s ko add krdenge kyonki wahi no of elements h jo mid se chhote ya barabr h
                 
            }

            if(count>=k){ // check krenge agr count k se barabr ya bada h agr h toh possible answer ko store krlenge aur left move krenge aur dekhenge kya mid ko chhota krne pr bhi usse chhote k elemnts h kya kuki hume smallest element chiye
                ans = mid;
                end = mid-1;
            }
            else{ // agr count k se chhota h mtlb mid se chhote elements k se km h islie right move krenge aur mid ko bada krenge
                start = mid+1;

            }
        }
        return ans;
        
    }
}