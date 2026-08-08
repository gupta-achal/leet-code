class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for(int right = 0; right<s.length(); right++){
            
            char ch = s.charAt(right);
            
            while(left<s.length() && set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);

            max = Math.max(max, right-left+1);

        }return max;
    }
}