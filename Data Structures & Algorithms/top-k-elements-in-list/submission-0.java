class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[k];

        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                int value = map.get(nums[i]);
                ++value;
                map.put(nums[i], value);
            }
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        for(int j = 0; j < k; j++) {
            ans[j] = entries.get(j).getKey();
        }

        return ans;

    }
}
