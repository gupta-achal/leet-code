class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum = 0;
        int total = 0;
        for(int i=0; i<nums.length; i++){
            preSum += nums[i];
            int rem = preSum - goal;

            if(map.containsKey(rem)){
                total += map.get(rem);
            }

            map.put(preSum, map.getOrDefault(preSum,0)+1);

        }
        return total;
    }
}