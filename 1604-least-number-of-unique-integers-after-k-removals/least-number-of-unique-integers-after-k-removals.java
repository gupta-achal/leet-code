class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> fMap = new HashMap<>();
        for(int x: arr){
            fMap.put(x, fMap.getOrDefault(x,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x: fMap.values()){
            pq.offer(x);
        }

        while(!pq.isEmpty() && k >= pq.peek() ){
            k -= pq.poll();
        }

        return pq.size();
    }
}