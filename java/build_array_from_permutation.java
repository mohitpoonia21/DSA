// ======================================
// LeetCode Problem: build array from permutation
// Language: java
// Link: https://leetcode.com/problems/build-array-from-permutation/
// Synced by: LinkCode
// Date: 8/22/2026, 2:17:08 AM
// ======================================


class Solution {
    public int[] buildArray(int[] nums) {

        int n = nums.length;
        int ans[] = new int[n]; // nayi array same size ki

        for(int i =0;i<n;i++){ // traverse
            ans[i]= nums[nums[i]]; // given logic se nayi array bnakr return krdenge
        }
        return ans;
        
    }
}