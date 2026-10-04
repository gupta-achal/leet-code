
class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.val != b.val) {
                return Integer.compare(a.val, b.val);
            }
            return Integer.compare(a.pos, b.pos);
        });

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new Pair(nums[i], i));
        }

        for (int i = 0; i < k; i++) {
            Pair p = pq.poll();
            p.val *= m;
            pq.offer(p);
        }

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            nums[p.pos] = p.val;
        }

        return nums;
    }
}

class Pair {
    int val;
    int pos;

    Pair(int val, int pos) {
        this.val = val;
        this.pos = pos;
    }
}
