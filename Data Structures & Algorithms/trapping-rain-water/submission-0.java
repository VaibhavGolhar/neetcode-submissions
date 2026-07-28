class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int len = height.length;
        int leftMax = height[0], rightMax = height[len - 1], l = 0, r = len - 1;

        while (l < r){
            if (leftMax < rightMax){
                l++;
                if (height[l] > leftMax) leftMax = height[l];

                int diff = leftMax - height[l];
                if (diff > 0) ans += diff;
            }
            else {
                r--;
                if (height[r] > rightMax) rightMax = height[r];

                int diff = rightMax - height[r];
                if (diff > 0) ans += diff;
            }
        }

        return ans;
    }
}