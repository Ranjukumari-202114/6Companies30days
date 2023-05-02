/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//626. Exchange Seats



# Write your MySQL query statement below


SELECT 
case when id%2 = 0 then id-1
when id%2 != 0 and (select max(id) from seat) != id then id+1
else id end id,student from Seat order by 1;
