class Solution {
    public int maxProduct(int[] nums) {
        int preProd = 1, postProd = 1;
        int n = nums.length-1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=n;  i++){
            if(preProd == 0){
                preProd = 1;
            }
            if(postProd == 0){
                postProd = 1;
            }

            preProd *= nums[i];
            postProd *= nums[n-i];
            max = Math.max(max,postProd);
            max = Math.max(max,preProd);
        }

        return max;
    }
}