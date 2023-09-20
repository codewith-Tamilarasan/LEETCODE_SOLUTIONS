class Solution {
    public int longestConsecutive(int[] nums) {
       if (nums.length <= 1) {
            return nums.length;
        }

        Arrays.sort(nums);

        int currentStreak = 1;
        int longestStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            } else if (nums[i] != nums[i - 1]) {
                currentStreak = 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }
}