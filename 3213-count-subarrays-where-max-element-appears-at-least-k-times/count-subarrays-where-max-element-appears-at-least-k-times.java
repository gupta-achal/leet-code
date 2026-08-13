class Solution {
    public long countSubarrays(int[] arr, int k) {
        int max = findMax(arr);
        long ans = 0;
        int countMax = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == max) {
                countMax++;
            }

            while (countMax >= k) {
                if (arr[left] == max) {
                    countMax--;
                }
                left++;
            }

            ans += left;
        }

        return ans;
    }

    private static int findMax(int[] arr) {
        int max = -1;

        for (int x : arr) {
            max = Math.max(max, x);
        }

        return max;
    }
}