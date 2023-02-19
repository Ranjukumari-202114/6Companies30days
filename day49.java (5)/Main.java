/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



762. Prime Number of Set Bits in Binary Representation





class Solution {
    public int countPrimeSetBits(int left, int right) {
     int tot_bit, count = 0;
     for(int i =left;i<=right;i++)
     {
         tot_bit = Integer.bitCount(i);
          if (isPrime(tot_bit))
            count++;
     }
     return count;   
    }
    public boolean isPrime(int n)
    {
          int c=0;
          for(int i=1; i<=n ;  i++)
          {
              if(n%i == 0)  c++;

          }
          if(c==2) return true;
          return false;
    }
}