class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long res = 0L;
        int max = nums[0];
        for (int x : nums) {
            max = Math.max(max, x);
        }
        int st = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == max) {
                c++;
            }
            while (c == k) {
                res += n - i;
                if (nums[st] == max) {
                    c--;
                }
                st++;
            }
        }

        return res;
    }
}