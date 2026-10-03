class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int gift:gifts){
            pq.offer(gift);
        }

        long ans = 0;

        for(int i=0; i<k; i++){
            int max = (int) Math.sqrt(pq.poll());
            pq.offer(max);
        }


        ans = 0;
        while(!pq.isEmpty()){
            ans += pq.poll();
        }

        return ans;
    }
}