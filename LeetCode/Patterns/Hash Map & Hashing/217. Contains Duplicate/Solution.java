class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){ // frequency ko store krenge agr phle se vo number present hoga toh frequency ko +1 krdenge vrna 1 krenge
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int num : nums){ // firse traverse krenge aur dekhenge kisi bhi number ki freq agr >1 hogi toh true return krdenge
            if(map.get(num)>1){
                return true;
            }
        }
        return false; //agr kisi bhi no ki frequency >1 nahi hogi toh false return krdenge
        
    }
}