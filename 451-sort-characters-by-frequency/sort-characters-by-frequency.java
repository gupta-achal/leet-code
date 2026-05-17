class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> fMap = new HashMap<>();

        for(char ch : s.toCharArray()) {
            fMap.put(ch, fMap.getOrDefault(ch, 0) + 1);
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for(char ch : fMap.keySet()) {

            int freq = fMap.get(ch);

            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = bucket.length - 1; i >= 0; i--) {

            if(bucket[i] != null) {

                for(char ch : bucket[i]) {

                    for(int j = 0; j < i; j++) {
                        sb.append(ch);
                    }
                }
            }
        }

        return sb.toString();
    }
}