/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2405. Optimal Partition of String


class Solution {
    public int partitionString(String s) {
     Set<Character> ss = new HashSet<>();
        int ans = 1;
        for (char c : s.toCharArray()) {
            if (ss.contains(c)) {
                ++ans;
                ss.clear();
            }
            ss.add(c);
        }
        return ans;   
    }
}