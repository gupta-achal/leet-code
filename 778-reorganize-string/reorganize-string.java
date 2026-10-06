class Solution {
    public String reorganizeString(String s) {

        Map<Character, Integer> fMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            fMap.put(ch, fMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.count - a.count
        );

        for (char key : fMap.keySet()) {
            pq.offer(new Pair(key, fMap.get(key)));
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {

            Pair first = pq.poll();

            if (sb.length() >= 1 &&
                sb.charAt(sb.length() - 1) == first.ch) {

                if (pq.isEmpty()) {
                    return "";
                }

                Pair second = pq.poll();

                sb.append(second.ch);
                second.count--;

                if (second.count > 0) {
                    pq.offer(second);
                }

                // Put first back because we didn't use it
                pq.offer(first);

            } else {

                sb.append(first.ch);
                first.count--;

                if (first.count > 0) {
                    pq.offer(first);
                }
            }
        }

        return sb.toString();
    }
}

class Pair {
    char ch;
    int count;

    Pair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}