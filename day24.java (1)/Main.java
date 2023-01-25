/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int countEven(int num) {
     if (sumOfDigit(num) % 2 == 0)
      return num / 2;
    return (num - 1) / 2;
  }

  private int sumOfDigit(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;   
    }
}