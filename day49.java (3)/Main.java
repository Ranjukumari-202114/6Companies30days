/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/




412. Fizz Buzz




class Solution {
    public List<String> fizzBuzz(int n) {
        List arr = new ArrayList();
        for(int i =1; i<=n;i++)
        {
            if(i%3 == 0 && i%5 ==0)
            {
                arr.add("FizzBuzz");
            }
            else if(i%3 ==0)
            {
                arr.add("Fizz");
            }
            else if(i%5 == 0)
            {
                arr.add("Buzz");
            }
            else
             arr.add(Integer.toString(i));
        }
        return arr;
        
    }
}