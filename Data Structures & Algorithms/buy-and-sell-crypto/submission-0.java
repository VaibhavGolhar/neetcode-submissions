class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];

        for (int i : prices){
            if (min > i){
                min = i;
                continue;
            }

            int diff = i - min;
            if (diff > ans) ans = diff;
        }

        return ans;
    }
}