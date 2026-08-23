class Solution {
    public boolean validateStackSequences(int[] push, int[] pop) {
        Stack<Integer> st = new Stack<>();
        int i=0,j=0;
        int n = push.length;

        while(i<n && j<n){
            if(push[i] != pop[j]){
                st.push(push[i++]);
            }else{
                i++;
                j++;
            }

            while(!st.isEmpty() && j<n && pop[j] == st.peek()){
                st.pop();
                j++;
            }
        }
        if(i == n && j == n && st.isEmpty()){
            return true;
        }
        return false;

    }
}