/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


119. Pascal's Triangle II



class Solution {
    public List<Integer> getRow(int rowIndex) {
    Integer[] ans = new Integer[rowIndex + 1];
    Arrays.fill(ans, 1);

    for (int i = 2; i < rowIndex + 1; ++i)
      for (int j = 1; j < i; ++j)
        ans[i - j] += ans[i - j - 1];

    return Arrays.asList(ans);  
    }
}