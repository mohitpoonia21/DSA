import java.util.ArrayList;

public class Solution 
{
    static boolean isValidAnswer(ArrayList<Integer>arr,int k,int maxLength){
        int painterCount = 1;
        int lenOfBoard = 0;
        
        for(int i =0;i<arr.size();i++){
            if(lenOfBoard + arr.get(i) <= maxLength){
                lenOfBoard = lenOfBoard + arr.get(i);
            }
            else{
                painterCount++;
                lenOfBoard = 0;
                if(arr.get(i)>maxLength || painterCount > k){
                    return false;
                }
                else{
                    
                    lenOfBoard = lenOfBoard + arr.get(i);
                }
            }
        }
        return true;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        
        int sum =0;
        
        for(int i =0;i<boards.size();i++){
            sum = sum + boards.get(i);
        }
        
        int start =0;
        int end = sum;
        int ans=-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(isValidAnswer(boards,k,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    
}
