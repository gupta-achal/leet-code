class Solution {
    public int countDistinct(int[] nums, int k, int p) {

        int left = 0;
        int count = 0;

        Set<List<Integer>> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % p == 0) {
                count++;
            }

            while (count > k) {
                if (nums[left] % p == 0) {
                    count--;
                }
                left++;
            }

            for (int start = left; start <= right; start++) {

                List<Integer> subarray = new ArrayList<>();

                for (int i = start; i <= right; i++) {
                    subarray.add(nums[i]);
                }

                set.add(subarray);
            }
        }

        return set.size();
    }
}