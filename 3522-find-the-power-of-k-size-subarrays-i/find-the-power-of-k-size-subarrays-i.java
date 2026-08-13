class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int c = 1;

        for (int right = 0; right < n; right++) {

            if (right > 0 && nums[right] == nums[right - 1] + 1) {
                c++;
            } else {
                c = 1;
            }

            if (right >= k - 1) {
                if (c >= k) {
                    result[right - k + 1] = nums[right];
                } else {
                    result[right - k + 1] = -1;
                }
            }
        }

        return result;
    }
}