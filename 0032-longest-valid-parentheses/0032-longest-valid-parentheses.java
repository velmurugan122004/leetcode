class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int lastInvalid = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                    if (st.isEmpty()) {
                        max = Math.max(max, i - lastInvalid);
                    } else {
                        max = Math.max(max, i - st.peek());
                    }
                } else {
                    lastInvalid = i;
                }
            }
        }
        return max;
    }
}
