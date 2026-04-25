class Solution {
    public int maxDistance(int[] positions, int m) {
        Arrays.sort(positions);
        int li = 1;
        int hi = positions[positions.length - 1] - positions[0];
        while(li <= hi){
            int mid = li + (hi-li)/2;
            int count = countBalls(positions,mid);

            if(count < m){
                hi = mid-1;
            }else{
                li = mid+1;
            }
        }
        


        return hi;
    }
    private static int countBalls(int[] positions, int gap){
        int count = 1;
        int lastPos = positions[0];
        for(int i=1; i<positions.length; i++){
            int currPos = positions[i];

            if(currPos - lastPos >= gap){
                count++;
                lastPos = currPos;
            }
        }
        return count;
    }
}