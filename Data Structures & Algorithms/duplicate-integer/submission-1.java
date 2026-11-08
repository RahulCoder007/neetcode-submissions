class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() < nums.length;

    }
}