class Solution {

    static int findPivotIndex(int arr[]){

            int n = arr.length; // array ki length
            int start = 0;
            int end = n-1;
            int ans = -1;

            if(arr[start]<arr[end]){ // agr rotated sorted array na ho
                return -1;
            }

            while(start<=end){

                int mid = start +(end-start)/2;

                if(arr[mid]<=arr[n-1]){ //jbb right side m h[L2] toh left m move krenge 
                    end = mid-1;
                }
                else{  // jbb left side m h [L1] toh potential answer ko store krenge aur right side move krenge agr usse badi koi value exist krti hogi toh usse dhundenge
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

                if(nums[mid]==target){ // target agr mid p hoga toh return krdenge
                    return mid;
                }
                else if(nums[mid]>target){ // target agr mid se chhota h toh mid k left side dhundenge
                    end = mid-1;
                }
                else{  // target agr mid se bada h toh mid k right side dhundenge
                    start = mid+1;
                }
            }
            return -1;

        }
    public int search(int[] nums, int target) {


        int PivotIndex = findPivotIndex(nums); // pivoindex nikalenge function ko call krke
        int n = nums.length;
        int start = 0;
        int end = n-1;

        if(PivotIndex == -1){ // agr array rotated sorted nahi h toh normal binarysearch use krenge pure array m
           int ans = binarySearch(nums,start,end,target);
           return ans;
        }
        else{

            // else m 2 case bnenge 

            // jbb target element m L1 m hoga toh srf L1 m binarysearch lgaynge
            int startArray1 = 0;
            int endArray1 = PivotIndex;

            if(target>=nums[startArray1] && target<=nums[endArray1]){ // check krenge agr L1 m h[left side]
            int ans = binarySearch(nums,startArray1,endArray1,target);
            return ans;
            }

            // jbb target element m L2 m hoga toh srf L1 m binarysearch lgaynge
            int startArray2 = PivotIndex +1;
            int endArray2 = n-1;

            if(target>=nums[startArray2] && target<=nums[endArray2]){ // check krenge agr L2 m h[right side]
            int ans = binarySearch(nums,startArray2,endArray2,target);
            return ans;
            }

        }

        return -1;
        
    }
}
