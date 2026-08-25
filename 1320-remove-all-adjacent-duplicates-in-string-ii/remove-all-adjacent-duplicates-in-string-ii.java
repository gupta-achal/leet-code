class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(!st.isEmpty() && st.peek().ch == ch){
                Pair p = st.pop();
                p.freq += 1;
                st.push(p);
            }else{
                st.push(new Pair(ch,1));
            }

            if(st.peek().freq == k){
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            Pair p = st.pop();
            for(int i=0; i<p.freq; i++){
                sb.append(p.ch);
            }
        }return sb.reverse().toString();
    }
}

class Pair{
    char ch;
    int freq;
    Pair(char ch, int f){
        this.ch = ch;
        this.freq = f;
    }
}