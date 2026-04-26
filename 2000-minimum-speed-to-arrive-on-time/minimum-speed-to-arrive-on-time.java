class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int li = 1;
        int hi = 10000000;
        int ans = -1;

        // Edge case
        if (hour <= dist.length - 1) return -1;

        while (li <= hi) {
            int mid = li + (hi - li) / 2;
            double hrs = countHours(dist, mid);

            if (hrs > hour) {
                li = mid + 1;   // need more speed
            } else {
                ans = mid;
                hi = mid - 1;   // try smaller speed
            }
        }
        return ans;
    }

    private static double countHours(int[] dist, int speed) {
        double totalHour = 0;

        for (int i = 0; i < dist.length; i++) {
            double time = (double) dist[i] / speed;

            if (i == dist.length - 1) {
                totalHour += time; // last train
            } else {
                totalHour += Math.ceil(time); // wait logic
            }
        }
        return totalHour;
    }
}