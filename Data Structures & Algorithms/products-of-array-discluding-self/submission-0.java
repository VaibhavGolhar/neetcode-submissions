class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        pre[0] = nums[0];

        for (int i = 1; i < len; i++){
            pre[i] = pre[i - 1] * nums[i];
        }

        int suff = nums[len - 1];
        nums[len - 1] = pre[len - 2];

        for (int i = len - 2; i >= 0; i--){
            int num = nums[i];
            if (i == 0){
                nums[i] = suff;
            }
            else nums[i] = pre[i - 1] * suff;
            suff *= num;
        }

        return nums;
    }
}