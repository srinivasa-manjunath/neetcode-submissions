class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> Seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!Seen.containsKey(nums[i])) {
                Seen.put(nums[i],i);
            }
            else {
                return true;
            }
        }

        return false;
    }
}