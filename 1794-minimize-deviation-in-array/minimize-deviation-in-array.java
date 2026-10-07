class Solution {
    public int minimumDeviation(int[] nums) {

        int n = nums.length;

        // Make every number even
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] *= 2;
            }
        }

        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> b - a);

        int min = Integer.MAX_VALUE;

        for (int x : nums) {
            pq.offer(x);
            min = Math.min(min, x);
        }

        int ans = Integer.MAX_VALUE;

        while (true) {

            int num = pq.poll();

            // Current deviation
            ans = Math.min(ans, num - min);

            // Can't reduce an odd number
            if (num % 2 != 0) {
                break;
            }

            // Reduce maximum
            num = num / 2;

            // Update minimum
            min = Math.min(min, num);

            pq.offer(num);
        }

        return ans;
    }
}