class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();

        while (i < j){
            char l = s.charAt(i), r = s.charAt(j);
            if (!Character.isLetterOrDigit(l)){
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(r)){
                j--;
                continue;
            }

            if (l != r) return false;
            i++;
            j--;
        }        

        return true;
    }
}