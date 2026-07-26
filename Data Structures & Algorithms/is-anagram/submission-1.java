class Solution {
    public boolean isAnagram(String s, String t) {
        int x = s.length(), y = t.length();
        if (x != y) return false;

        int[] freq = new int[26];

        for (int i = 0; i < x; i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i : freq){
            if (i != 0) return false;
        }

        return true;
    }
}
