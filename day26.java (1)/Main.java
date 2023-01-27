/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public char findTheDifference(String s, String t) {
     int[] count = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']--;
            count[t.charAt(i) - 'a']++;
        }
        count[t.charAt(n) - 'a']++;
        int c = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                c = i + 'a';
                break;
            }
        }
        return (char) c;   
    }
}