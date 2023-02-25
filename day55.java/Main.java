/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//181. Employees Earning More Than Their Managers




# Write your MySQL query statement below




select a.Name as `Employee`
from `Employee` as a join `Employee` as b
on a.ManagerId = b.Id
and a.Salary > b.Salary