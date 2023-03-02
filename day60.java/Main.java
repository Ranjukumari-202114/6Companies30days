/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1323. Maximum 69 Number




class Solution {
    public int maximum69Number (int num) {

    int arr[] = new int[4];
    int i=0, c=1;
    while(num != 0)
    {
        arr[i++] = num%10;
        num/=10;
    }
    for ( i = 3; i >=0; i--)
    {
      if (arr[i] != 0 ) 
      {
        if(arr[i] == 6 && c-->0)
           num = num*10+9;
        else
           num = num*10+arr[i];
      }
    }
    return num;
  }
}