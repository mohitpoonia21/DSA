class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();


        for(int i =0;i<n;i++){ // frequencies ko store krenge getOrDefault ko use krke agr nums[i] alr exist krta hoga toh freq ko +1 krdenge vrna freq 0+1 hojayga
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i = 1; i<=n;i++){ // traverse krenge aur dekhenge agr 1 to n range mai koi number ka freq 0 h toh usko ans m add krdenge
            if(map.getOrDefault(i,0)==0){
                ans.add(i);
            }
        }
        return ans;
    }
}