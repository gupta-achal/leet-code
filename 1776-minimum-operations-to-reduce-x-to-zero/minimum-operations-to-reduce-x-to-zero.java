class Solution {
    public int minOperations(int[] nums, int x) {

        int sum = Arrays.stream(nums).sum();
        int n = nums.length;

        if (sum < x) {
            return -1;
        }

        x = sum - x;

        if (x == 0) {
            return n;
        }

        int max = 0;
        int left = 0;
        int currSum = 0;

        for (int right = 0; right < n; right++) {

            currSum += nums[right];

            while (currSum > x) {
                currSum -= nums[left];
                left++;
            }

            if (currSum == x) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max == 0 ? -1 : n - max;
    }
}