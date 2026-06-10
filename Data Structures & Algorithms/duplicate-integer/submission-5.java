class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> Seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!Seen.contains(nums[i])) {
                Seen.add(nums[i]);
            }
            else {
                return true;
            }
        }

        return false;
    }
}