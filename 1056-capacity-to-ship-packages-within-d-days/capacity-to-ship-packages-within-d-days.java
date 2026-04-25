class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int li = Arrays.stream(weights).max().getAsInt();
        int hi = Arrays.stream(weights).sum();

        while(li <= hi){
            int mid = li + (hi-li)/2;
            int ed = countDays(weights,mid);

            if(ed > days){
                li = mid+1;
            }else{
                hi = mid-1;
            }
        }return li;
    }
    private static int countDays(int[] weights, int cap){
        int count = 1;
        int total = 0;
        for(int w: weights){
            if(total + w <= cap){
                total += w;
            }
            else{
                count ++;
                total = w;
            }
        }
        return count;
    }
}