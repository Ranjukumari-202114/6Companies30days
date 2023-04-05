/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1200. Minimum Absolute Difference



class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
     List<List<Integer>> ans = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    Arrays.sort(arr);

    for (int i = 0; i + 1 < arr.length; ++i) {
      int diff = arr[i + 1] - arr[i];
      if (diff < min) {
        min = diff;
        ans.clear();
      }
      if (diff == min)
        ans.add(Arrays.asList(arr[i], arr[i + 1]));
    }

    return ans;   
    }
}