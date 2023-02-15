/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



989. Add to Array-Form of Integer




class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
     List<Integer> ans = new LinkedList<>();

    for (int i = num.length - 1; i >= 0; --i) {
      ans.add(0, (num[i] + k) % 10);
      k = (num[i] + k) / 10;
    }

    while (k > 0) {
      ans.add(0, k % 10);
      k /= 10;
    }

    return ans;   
    }
}