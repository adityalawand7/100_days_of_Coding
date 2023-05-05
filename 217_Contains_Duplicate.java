class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int n : nums) {
            if (numSet.contains(n)){
                return true;
            }
            numSet.add(n);
        }
        return false;
    }
}
