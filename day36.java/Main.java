/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

182. Duplicate Emails




# Write your MySQL query statement below


select `Email` from `Person` group by `Email` having count(*)>1
