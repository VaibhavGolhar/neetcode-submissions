class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            String str = strs[i];
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String strKey = String.valueOf(arr);
            if (map.containsKey(strKey)){
                map.get(strKey).add(str);
            }
            else {
                map.put(strKey, new ArrayList<>());
                map.get(strKey).add(str);
            }
        }

        return new ArrayList<>(map.values());
    }
}
