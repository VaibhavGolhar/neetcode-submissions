class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        if (len == 1) return 1;

        int ans = 1;
        int i = 0, j = 0, max = 0;
        int[] chars = new int[26];

        while (j < len){
            char curr = s.charAt(j);

            chars[curr - 'A']++;
            if (chars[curr - 'A'] >= max) {
                max = chars[curr - 'A'];
            }

            if (j - i + 1 - max > k){
                chars[s.charAt(i) - 'A']--;
                i++;
            }

            if (j - i + 1 > ans) ans = j - i + 1;

            j++;
        }

        return ans;
    }
}