class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] arr = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            int num = e.getKey();
            int count = e.getValue();

            if (Objects.isNull(arr[count])) arr[count] = new ArrayList<>();
            arr[count].add(num);
        }

        int i = nums.length, j = 0;
        int[] ans = new int[k];
        while(k > 0 && i >= 0){
            if (arr[i] == null){
                i--;
                continue;
            }

            for(int x : arr[i]){
                ans[j++] = x;
                k--;
                if (k == 0) break;
            }
            i--;
        }

        return ans;
    }
}
