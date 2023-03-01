/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




//1304. Find N Unique Integers Sum up to Zero





class Solution {
    public int[] sumZero(int n) {
       /*int[] answer = new int[n];
        int index = 0;
    
        if (n % 2 == 1)
            answer[index++] = 0;
        
        
        n /=2;
        for (int i = 1; i <= n; i++) {
            answer[index++] = i;
            answer[index++] = -i;
        }
        
        return answer;  

        */
        int [] arr = new int[n];
        if(n%2 == 0)
        {
            for(int i=0;i<n;i=i+2)
            {
               arr[i]=i+1;
               arr[i+1] = -(i+1);
            }
        }

        else
        {
            for(int i=0 ; i<n-1; i=i+2)
            {
               arr[i]=i+1;
               arr[i+1] = -(i+1); 
            }
            arr[n-1] = 0;
        }
        return arr; 
    }
}