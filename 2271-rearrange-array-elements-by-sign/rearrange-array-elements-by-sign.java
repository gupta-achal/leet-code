class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] neg = new int[n/2];
        int[] pos = new int[n/2];
        int i=0,j=0;

        for(int k=0; k<n; k++){
            if(nums[k] < 0){
                neg[i++] = nums[k];
            }else{
                pos[j++] = nums[k];
            }
        }
        i=0;j=0;
        for(int k=0; k<n; k++){
            nums[k++] = pos[i++];
            nums[k] = neg[j++];
        }
        return nums;

    }
}