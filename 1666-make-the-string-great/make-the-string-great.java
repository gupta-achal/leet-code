class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(char ch: s.toCharArray()){

            if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32){
                st.pop();
            }else{
                st.push(ch);
            }

        }
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        
        return str.reverse().toString();
    }
}