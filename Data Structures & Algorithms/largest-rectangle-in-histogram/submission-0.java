class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0, len = heights.length;
        int[] leftMin = new int[len];
        int[] rightMin = new int[len];

        leftMin[0] = -1;
        rightMin[len - 1] = len;

        for (int i = 1; i < len; i++){
            if (heights[i - 1] > heights[i]){
                int min = leftMin[i - 1];
                while (min != -1 && heights[min] >= heights[i]) min = leftMin[min];
                leftMin[i] = min;
            }
            else if (heights[i - 1] < heights[i]) leftMin[i] = i - 1;
            else leftMin[i] = leftMin[i - 1];
        }

        for (int i = len - 2; i >= 0; i--){
            if (heights[i + 1] > heights[i]){
                int min = rightMin[i + 1];
                while (min != len && heights[min] >= heights[i]) min = rightMin[min];
                rightMin[i] = min;
            }
            else if (heights[i + 1] < heights[i]) rightMin[i] = i + 1;
            else rightMin[i] = rightMin[i + 1];
        }

        for (int i = 0; i < len; i++){
            int curr = (rightMin[i] - leftMin[i] - 1) * heights[i];
            ans = curr > ans ? curr : ans;
        }

        return ans;
    }
}