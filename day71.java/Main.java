/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//605. Can Place Flowers



class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
     if (n == 0)
      return true;

    for (int i = 0; i < flowerbed.length; ++i)
      if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
          (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
        flowerbed[i] = 1;
        if (--n == 0)
          return true;
      }

    return false;   
    }
}
