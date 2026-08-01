class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int count = 1;
        Arrays.sort(nums);
        for(int i=1; i<=r; i++){
            if(nums[i-1] == nums[i]){
                count++;
            }else{
                count = 1;
            }
            if(count>2){
               nums[i-1] = Integer.MAX_VALUE; 
            }
        }
        for(int x: nums){
            System.out.print(x+" ");
        }
        int i=0;
        for(int x: nums){
            if(x != Integer.MAX_VALUE){
                nums[i++] = x;
            }
        }
        
        
        
        return i;
    }
}