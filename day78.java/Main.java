/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//242. Valid Anagram



class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length() != t.length())
       return false;
     
     char[] arr1  = s.toCharArray();
     char[] arr2  = t.toCharArray();

     Arrays.sort(arr1);
     Arrays.sort(arr2);

    if(Arrays.equals(arr1,arr2))
       return true;
    return false;
    }
}