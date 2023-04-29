/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public int findComplement(int num) {
      for (long i = 1; i <= num; i <<= 1)
          num ^= i;
      return num;  
	}
}
