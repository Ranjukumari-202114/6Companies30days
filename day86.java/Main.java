/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1207. Unique Number of Occurrences





class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     Map<Integer, Integer> count = new HashMap<>();
    Set<Integer> occurrences = new HashSet<>();

    for (final int a : arr)
      count.merge(a, 1, Integer::sum);

    for (final int value : count.values())
      if (!occurrences.add(value))
        return false;

    return true;   
    }
}