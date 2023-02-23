/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




//1103. Distribute Candies to People





class Solution {
    public int[] distributeCandies(int candies, int num_people) {
      int[] arr = new int[num_people];
        int i = 0;
        int candy = 1;

        while(candy<=candies)
        {
            if(i== num_people) i=0;
            arr[i] += candy;
            candies -= candy;
            candy +=1;
            i++;
        }
        if(candies > 0)
        {
            if(i == num_people) i=0;
            arr[i] += candies;
        }
        return arr;

    }
}