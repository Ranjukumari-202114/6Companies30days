/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//2418. Sort the People



class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
     for (int i=0;i< heights.length-1;i++){
        for (int j=0;j< heights.length-1-i;j++){
            if (heights[j]<heights[j+1]){
                int temp = heights[j];
                heights[j]=heights[j+1];
                heights[j+1]=temp;

                //in names string
                String temps = names[j];
                names[j]=names[j+1];
                names[j+1]=temps;
            }
        }
    }
         return names;   
    }
}
