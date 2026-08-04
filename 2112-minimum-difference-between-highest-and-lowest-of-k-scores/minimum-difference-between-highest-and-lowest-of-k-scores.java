class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        for(int i=k; i<=nums.length; i++){
            int l = nums[i-k];
            int r = nums[i-1];
            int diff = r-l;
            min = Math.min(min,diff);
        }
        return min;
    }
}