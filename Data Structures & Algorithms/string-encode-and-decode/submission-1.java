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
            StringBuilder sb = new StringBuilder();

            while (str.charAt(i) != '#'){
                sb.append(str.charAt(i));
                i++;
            }
            int len = Integer.parseInt(sb.toString());

            i++;
            String word = str.substring(i, i + len);
            i += len;
            ans.add(word);
        }

        return ans;
    }
}
