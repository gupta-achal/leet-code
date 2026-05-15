class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        int n = s.length();
        for(int i=0; i<n; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            freq[c1 - 'a']++;
            freq[c2 - 'a']--;
        }

        for(int x: freq){
            if(x!=0){
                return false;
            }
        }
        return true;

    }
}