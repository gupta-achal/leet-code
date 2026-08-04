class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        threshold = threshold*k;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int count = 0;
        if(sum >= threshold){
            count++;
        }
        for(int i=k; i<arr.length; i++){
            sum -= arr[i-k];
            sum += arr[i];

            if(sum >= threshold){
                count++;
            }
        }
        return count;
    }
}