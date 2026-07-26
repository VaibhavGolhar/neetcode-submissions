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
        StringBuilder sb = new StringBuilder();

        while (i < str.length()){
            String l = "";
            while (str.charAt(i) != '#'){
                l += str.charAt(i);
                i++;
            }
            int len = Integer.parseInt(l);

            i++;
            for (int x = 0; x < len; x++){
                sb.append(str.charAt(i));
                i++;
            }

            ans.add(sb.toString());
            sb.delete(0, len);
        }

        return ans;
    }
}
