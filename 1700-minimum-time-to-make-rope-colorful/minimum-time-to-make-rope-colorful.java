class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int n = colors.length();
        for(int i=1; i<n; i++){
            char prev = colors.charAt(i-1);
            int curr = colors.charAt(i);
            if(prev == curr){
                time += Math.min(neededTime[i-1],neededTime[i]);
                neededTime[i] = Math.max(neededTime[i-1],neededTime[i]);
            }
        }
        return time;
    }
}