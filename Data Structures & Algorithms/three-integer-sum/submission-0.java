class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){
            List<List<Integer>> triplets = twoSum(nums, i + 1, nums[i] * -1);
            if (!triplets.isEmpty()){
                for (List<Integer> trip : triplets){
                    trip.add(nums[i]);
                    if (!set.contains(trip.toString())){
                        ans.add(trip);
                        set.add(trip.toString());
                    }
                }
            }
        }

        return ans;
    }

    private List<List<Integer>> twoSum(int[] nums, int l, int target){
        List<List<Integer>> triplets = new ArrayList<>();
        int i = l, j = nums.length - 1;

        while (i < j){
            int sum = nums[i] + nums[j];
            if (sum < target) i++;
            else if (sum > target) j--;
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                triplets.add(temp);
                i++;
                j--;
            }
        }

        return triplets;
    }
}