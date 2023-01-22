/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


196. Delete Duplicate Emails

// Please write a DELETE statement and DO NOT write a SELECT statement.
// Write your MySQL query statement below


DELETE p1
FROM Person p1, Person p2
WHERE p1.Email = p2.Email AND p1.Id > p2.Id