class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int b=0;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                b = i+1;
                break;
            }
        }
        System.out.println(b + " " + nums[b]);

        for(int i=b; i<(n+b)-1; i++){
            if(nums[i%n] > nums[(i+1)%n]){
                return false;
            }
        }

        return true;
    }
}