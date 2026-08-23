public static int[] nextHigherPeak(int[] heights) {
    int n = heights.length;
    int[] ans = new int[n];
    Stack<Integer> st = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {

        while (!st.isEmpty() && st.peek() <= heights[i]) {
            st.pop();
        }

        if (st.isEmpty()) {
            ans[i] = -1;
        } else {
            ans[i] = st.peek();
        }

        st.push(heights[i]);
    }

    return ans;
}