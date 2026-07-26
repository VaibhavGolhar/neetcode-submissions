class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            int len = str.length();
            sb.append(len);
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < str.length()){
            int len = 0;
            while (str.charAt(i) != '#'){
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }

            i++;
            String word = str.substring(i, i + len);
            i += len;
            ans.add(word);
        }

        return ans;
    }
}
