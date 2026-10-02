class StockSpanner {

    Stack<Pair> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while (!st.isEmpty() && st.peek().price <= price) {
            span += st.pop().d;
        }

        st.push(new Pair(price, span));

        return span;
    }
}

class Pair {
    int price;
    int d;

    Pair(int price, int d) {
        this.price = price;
        this.d = d;
    }
}