class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Frequency of s1
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // First window of s2
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        // Slide window
        for (int i = s1.length(); i < s2.length(); i++) {

            if (map1.equals(map2)) {
                return true;
            }

            // Character leaving window
            char lc = s2.charAt(i - s1.length());

            map2.put(lc, map2.get(lc) - 1);

            if (map2.get(lc) == 0) {
                map2.remove(lc);
            }

            // Character entering window
            char rc = s2.charAt(i);

            map2.put(rc, map2.getOrDefault(rc, 0) + 1);
        }

        return map1.equals(map2);
    }
}