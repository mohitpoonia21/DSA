class Solution {

    static int findPivotIndex(int arr[]){

            int n = arr.length;
            int start = 0;
            int end = n-1;
            int ans = -1;

            if(arr[start]<arr[end]){
                return -1;
            }

            while(start<=end){

                int mid = start +(end-start)/2;

                if(arr[mid]<=arr[end]){
                    end = mid-1;
                }
                else{
                    ans = mid;
                    start = mid+1;
                }
            }
            return ans;
        }

        static int binarySearch(int nums[],int start,int end,int target){
            int n = nums.length;

            while(start<=end){

                int mid = start+ (end-start)/2;

                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return -1;

        }
    public int search(int[] nums, int target) {


        int PivotIndex = findPivotIndex(nums);
        int n = nums.length;
        int start = 0;
        int end = n-1;

        if(PivotIndex == -1){
           int ans = binarySearch(nums,start,end,target);
           return ans;
        }
        else{
            int startArray1 = 0;
            int endArray1 = PivotIndex;

            if(target>=nums[startArray1] && target<=nums[endArray1]){
            int ans = binarySearch(nums,startArray1,endArray1,target);
            return ans;
            }

            int startArray2 = PivotIndex +1;
            int endArray2 = n-1;

            if(target>=nums[startArray2] && target<=nums[endArray2]){
            int ans = binarySearch(nums,startArray2,endArray2,target);
            return ans;
            }

        }

        return -1;
        
    }
}