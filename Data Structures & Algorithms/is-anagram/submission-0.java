class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        int i = 0, j = 0, x = s.length(), y = t.length();
        while (i < x && j < y){
            sFreq[s.charAt(i++) - 'a']++;
            tFreq[t.charAt(j++) - 'a']++;
        }

        while (i < x){
            sFreq[s.charAt(i++) - 'a']++;
        }

        while (j < y){
            tFreq[t.charAt(j++) - 'a']++;
        }

        for (int z = 0; z < 26; z++){
            if (sFreq[z] != tFreq[z]) return false;
        }

        return true;
    }
}
