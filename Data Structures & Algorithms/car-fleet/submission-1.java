class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];

        for (int i = 0; i < position.length; i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        ArrayDeque<Float> stack = new ArrayDeque<>();
        stack.push(((float)(target - pairs[0][0])) / pairs[0][1]);

        for (int i = 1; i < position.length; i++){
            float curr = ((float)target - pairs[i][0]) / pairs[i][1];
            if (stack.peek() < curr) stack.push(curr);
        } 

        return stack.size();
    }
}
