class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 1) return len;

        int ans = 1;
        int[] chars = new int[128];
        int i = 0, j = 1;
        chars[s.charAt(0)] = 1;

        while (j < len){
            if (chars[s.charAt(j)] > 0){
                int next = chars[s.charAt(j)];
                while (i < next){
                    chars[s.charAt(i)] = 0;
                    i++;
                }
            }

            chars[s.charAt(j)] = j + 1;
            if (j - i + 1 > ans) ans = j - i + 1;
            j++;
        }

        return ans;
    }
}