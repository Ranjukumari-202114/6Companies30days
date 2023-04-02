/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1122. Relative Sort Array




class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
     int[] result  = new int[arr1.length];
     int[] count  = new int[1001];
     int i=0;

     for(int a:  arr1)
     {
        count[a]++;
     }

     for(int a:  arr2)
     {
        while(count[a] -- > 0)
          result[i++]= a;
     } 

     for(int num=0; num<1001; num++)
     {
         while(count[num] -- > 0)
          result[i++]= num;
     }
     return result;  
    }
}