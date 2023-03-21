/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1185. Day of the Week



class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
      int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
      String[] dayofweek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 


      int sum =4;
      for(int i = 1971; i<year; i++)
      {
          if(i%400 == 0 || (i%100 != 0 && i%4 == 0))
             sum = sum+366;
          else
             sum = sum+365;

      }

      for(int i=0; i<month-1;i++)
      {
          if(i==1&&((year%4==0&&year%100!=0)||year%400==0))sum++;
          sum=sum+days[i];
      }
      sum=sum+day;
      return dayofweek[sum%7];
      
    }
    
}