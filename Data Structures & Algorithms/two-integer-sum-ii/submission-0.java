class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;

        for (int i = 0; i < len - 1; i++){
            int t = target - numbers[i];
            int index = binarySearch(i + 1, numbers, t);

            if (index != -1) return new int[]{i + 1, index + 1};
        }

        return new int[]{0 , 0};
    }

    private int binarySearch(int l, int[] nums, int t){
        int r = nums.length;
        int len = r;
        int mid = l + (r - l) / 2;

        while (l <= r && mid < len && mid >= 0 && nums[mid] != t){
            mid = l + (r - l) / 2;

            if (mid < len && mid >= 0 && t > nums[mid]) l = mid + 1;
            else if (mid < len && mid >= 0 && t < nums[mid]) r = mid - 1;
        }

        if (mid < len && mid >= 0 && nums[mid] == t) return mid;
        return -1;
    }
}