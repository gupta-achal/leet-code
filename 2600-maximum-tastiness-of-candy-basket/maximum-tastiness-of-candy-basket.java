class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int li = 0;
        int hi = price[price.length-1] - price[0];

        while(li <= hi){
            int mid = li + (hi-li)/2;
            int candy = noOfCandy(price,mid);

            if(candy >= k){
                li = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return hi;

    }

    private static int noOfCandy(int[] price, int t){
        int count =1;
        int lastP = price[0];
        int n = price.length;
        for(int i=1; i<n; i++){
            int currP= price[i];

            if(currP - lastP >= t){
                lastP = currP;
                count++;
            }
        }
        return count;
    }
}