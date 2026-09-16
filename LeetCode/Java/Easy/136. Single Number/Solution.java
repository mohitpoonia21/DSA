class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){ // frequency ko store krenge agr number phle se present hoga toh frequency ko +1 krdenge vrna frequency ko 1 krdenge
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int num : nums){ // array ko traverse krenge aur dekhenge jis bhi number ki frequency 1 hogi usse return krdenge
            if(map.get(num)==1){
                return num;
            }
        }
        return -1; // agr koi bhi number nahi milega 1 frequency wala toh -1 return krdenge
        
    }
}