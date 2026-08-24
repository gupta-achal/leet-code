class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st = new Stack<>();
        int n = ast.length;

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() 
                    && st.peek() > 0 
                    && ast[i] < 0 
                    && st.peek() < Math.abs(ast[i])) {

                st.pop();
            }

            if (!st.isEmpty() 
                    && st.peek() > 0 
                    && ast[i] < 0 
                    && st.peek() == Math.abs(ast[i])) {

                st.pop();

            } else if (st.isEmpty() 
                    || st.peek() < 0 
                    || ast[i] > 0) {

                st.push(ast[i]);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}