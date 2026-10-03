class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();

        for (int x : nums) {
            pq.offer(x);
        }
    }

    public int add(int val) {
        pq.offer(val);

        while(pq.size() > k){
            pq.poll();
        }

        return pq.peek();
    }
}