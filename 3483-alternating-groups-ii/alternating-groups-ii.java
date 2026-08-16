class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int length = 1;

        for (int i = 1; i < n + k - 1; i++) {
            if (colors[i % n] != colors[(i - 1) % n]) {
                length++;
            } else {
                length = 1;
            }

            if (length >= k) {
                count++;
            }
        }

        return count;
    }
}