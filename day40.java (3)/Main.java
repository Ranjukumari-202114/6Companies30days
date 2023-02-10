/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


1873. Calculate Special Bonus


# Write your MySQL query statement below

SELECT employee_id, 
if(employee_id % 2 = 0 OR name LIKE 'M%',0,salary ) AS bonus
FROM Employees
ORDER BY employee_id;



SELECT employee_id, 
if(employee_id % 2 = 1 and name not LIKE 'M%',salary ,0) AS bonus
FROM Employees
ORDER BY employee_id;
