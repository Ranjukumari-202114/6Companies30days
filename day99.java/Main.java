/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//577. Employee Bonus




# Write your MySQL query statement below


select name, bonus
from Employee e
left join Bonus b
on e.empId = b.empId 
where b.bonus < 1000 or b.bonus is null