class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int li = 1;
        int hi = Arrays.stream(piles).max().getAsInt();

        while(li <= hi){
            int mid = li + (hi-li)/2;
            int tr = timeRequiredToEatKbananas(piles,mid);

            if(tr > h){
                li = mid+1;
            }else{
                hi = mid-1;
            }
        }



        return li;
    }
    private static int timeRequiredToEatKbananas(int[] piles, int k){
        int h = 0;

        for(int b: piles){
            h += Math.ceil((double)b/(double)k);
        }
        return h;
    }
}