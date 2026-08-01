class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = 2*nums[i];
                nums[i+1] = 0;
            }
        }
        int i=0;
        for(int x: nums){
            if(x!=0){
                nums[i++] = x;
            }
        }
        while(i<n){
            nums[i++] = 0;
        }
        return nums;
    }
}