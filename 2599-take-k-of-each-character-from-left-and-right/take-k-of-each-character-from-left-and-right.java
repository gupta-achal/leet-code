class Solution {
    public int takeCharacters(String s, int k) {
        int n = s.length();
        int[] total = new int[3];
        for(char ch: s.toCharArray()){
            total[ch - 'a'] ++;
        }

        int left = 0;
        int max = 0;
        if(total[0] < k || total[1] < k || total[2] < k){
            return -1;
        }

        for(int right=0; right<n; right++){

            total[s.charAt(right) - 'a']--;

            while(total[s.charAt(right) - 'a'] < k){
                total[s.charAt(left) - 'a']++;
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return n-max;



    }
}