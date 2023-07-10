https://leetcode.com/problems/product-of-array-except-self/description/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int prefix = 1;
        for(int i = 0;i<n;i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i=ans.length-1;i>=0;i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
}
