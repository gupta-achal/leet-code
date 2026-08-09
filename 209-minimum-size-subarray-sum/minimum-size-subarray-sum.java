class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int left=0;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int preSum = 0;
        for(int right=0; right<n; right++){
            preSum += arr[right];

            while(preSum >= target){
                min = Math.min(min, right-left+1);
                preSum -= arr[left];
                left++;
            }

        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}