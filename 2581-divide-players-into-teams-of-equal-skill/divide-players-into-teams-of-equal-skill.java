class Solution {
    public long dividePlayers(int[] arr) {
        Arrays.sort(arr);
        int l=0, r=arr.length-1;
        int sum = arr[l] + arr[r];
        long ans = 0;
        while(l<r){
            int s = arr[l] + arr[r];
            if(s!=sum){
                return -1;
            }

            ans += arr[l] * arr[r];
            l++;
            r--;
        }
        return ans;
    }
}