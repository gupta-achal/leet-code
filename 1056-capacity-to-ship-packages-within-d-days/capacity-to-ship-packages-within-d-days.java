class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int li = Arrays.stream(weights).max().getAsInt();
        int hi = Arrays.stream(weights).sum();
        while(li<=hi){
            int mid = li + (hi-li)/2;
            int td = countDays(weights,mid);

            if(td >days){
                li = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return li;
    }
    private static int countDays(int[] weights, int cap){
        int days = 1;
        int total = 0;
        for(int w:weights){
            total += w;

            if(total > cap){
                days++;
                total = w;
            }
        }return days;
    }
}