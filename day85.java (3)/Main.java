/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1075. Project Employees I




//# Write your MySQL query statement below


SELECT
    project_id,
    ROUND(AVG(experience_years),2) average_years
FROM
    Project  LEFT JOIN Employee  ON
    Project.employee_id = Employee.employee_id
GROUP BY
    project_id