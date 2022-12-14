class Solution {
    public int rob(int[] nums) {        
        int[] memo = new int[nums.length + 1];
        
        if (nums.length < 3) {
            return Arrays.stream(nums).max().getAsInt();
        }
        
        memo[1] = nums[0];
        memo[2] = Math.max(nums[0], nums[1]);
        
        for (int i = 3; i <= nums.length; i++) {
            memo[i] = Math.max(memo[i - 1], memo[i - 2] + nums[i - 1]);
        }
        
        return Arrays.stream(memo).max().getAsInt();
    }
}