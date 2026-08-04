class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len2 < len1) return false;

        int[] chars = new int[26];
        for (int i = 0; i < len1; i++){
            chars[s1.charAt(i) - 'a']++;
        }

        int l = 0;
        while (l < len2 && s2.charAt(l) == 0) l++;

        int r = l;
        while (r < len2){
            if (r - l + 1 > len1) return true;

            if (chars[s2.charAt(r) - 'a'] > 0){
                chars[s2.charAt(r) - 'a']--;
                r++;
            }
            else{
                chars[s2.charAt(l) - 'a']++;
                l++;
            }
        }

        if (r == len2 && r - l + 1 > len1) return true;

        return false;
    }
}