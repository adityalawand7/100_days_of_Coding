class Solution {
    public int maxProductDifference(int[] nums) {
        int diff = 0;
        Arrays.sort(nums);
        diff = (nums[nums.length-1] * nums[nums.length-2]) - (nums[0] * nums[1]);
        return diff;
    }
}
