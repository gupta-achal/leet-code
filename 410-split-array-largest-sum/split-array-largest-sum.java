class Solution {
    public int splitArray(int[] nums, int k) {
        int li = Arrays.stream(nums).max().getAsInt();
        int hi = Arrays.stream(nums).sum();

        while(li<=hi){
            int mid = li + (hi-li)/2;
            int count = countArraysAtGivenSum(nums,mid);

            if(count > k){
                li = mid+1;
            }else{
                hi = mid-1;
            } 
        }
        return li;
    }
    private static int countArraysAtGivenSum(int[] nums, int sum){
        int count = 1;
        int total = 0;
        for(int x: nums){
            if(total + x <= sum){
                total += x;
            }else{
                count++;
                total = x;
            }
        }
        return count;
    }
}