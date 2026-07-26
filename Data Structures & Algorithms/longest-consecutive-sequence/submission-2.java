class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int ans = 1, count = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] == nums[i] - 1) count++;
            else if (nums[i - 1] == nums[i]) continue;
            else {
                if (count > ans) ans = count;
                count = 1;
            }
        }

        if (count > ans) ans = count;
        
        return ans;
    }
}
