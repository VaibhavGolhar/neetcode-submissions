class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int len = temperatures.length;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++){
            int curr = temperatures[i];
            while (!stack.isEmpty() && temperatures[stack.peek()] < curr){
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }

        return ans;
    }
}