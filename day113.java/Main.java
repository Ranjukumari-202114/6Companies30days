/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1047. Remove All Adjacent Duplicates In String



class Solution {
    public String removeDuplicates(String s) {
      StringBuilder sb = new StringBuilder();

    for (final char c : s.toCharArray()) {
      final int n = sb.length();
      if (n > 0 && sb.charAt(n - 1) == c)
        sb.deleteCharAt(n - 1);
      else
        sb.append(c);
    }

    return sb.toString();  
    }
}
