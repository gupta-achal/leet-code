class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int m) {
        int satisfied =0, n = customers.length;
        for(int i=0; i<m; i++){
            satisfied += customers[i];
        }
        for(int i=m; i<n; i++){
            if(grumpy[i] == 0){
                satisfied += customers[i];
            }
        }
        int max = satisfied;

        for(int i=m; i<n; i++){
            
            if(grumpy[i] == 1){
                satisfied += customers[i];
            }

            if(grumpy[i-m] == 1){
                satisfied -= customers[i-m];
            }

            max = Math.max(max, satisfied);
        }

        return max;

    }
}