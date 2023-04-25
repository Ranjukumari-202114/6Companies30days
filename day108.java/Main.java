/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//821. Shortest Distance to a Character

class Solution {
    public int[] shortestToChar(String s, char c) {
        int N = s.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < N; ++i) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = N-1; i >= 0; --i) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;  
    }
}
