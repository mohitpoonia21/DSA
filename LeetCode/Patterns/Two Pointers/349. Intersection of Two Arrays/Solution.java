class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        

        HashSet<Integer> result = new HashSet<>();

        HashSet<Integer> ans = new HashSet<>();

        for(int i = 0;i<n1;i++){
            result.add(nums1[i]);
        }

        for(int i = 0;i<n2;i++){
            if(result.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }

        int[] answer = new int[ans.size()];
        int index =0;

        for(int nums: ans){
            answer[index] = nums;
            index++;
        }
        return answer;
    }
}