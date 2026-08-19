class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;

        int left = 0;
        int right = n;

        // Find insertion position of x
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int l = left - 1;
        int r = left;

        for (int i = 0; i < k; i++) {

            if (l >= 0 &&
                (r >= n || x - arr[l] <= arr[r] - x)) {

                l--;

            } else {

                r++;
            }
        }

        // Selected elements are from l+1 to r-1
        for (int i = l + 1; i < r; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}