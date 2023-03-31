/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//944. Delete Columns to Make Sorted



class Solution {
    public int minDeletionSize(String[] strs) {
      if (strs == null || strs.length == 0) {
        return 0;
      }
      int deletion = 0;
      for (int i = 0; i < strs[0].length(); i++) {
        for (int j = 0; j < strs.length - 1; j++) {
          if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
            deletion++;
            break;
          }
        }
      }
      return deletion;   
    }
}