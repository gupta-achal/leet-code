class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int left = 0;
        long prod = 1;
        int count = 0;

        for(int right = 0; right<nums.length; right++){
            prod *= nums[right];

            while(prod >= k){
                prod = prod/nums[left];
                left++;
            }

            count += right-left+1;
        }
        return count;
    }
}