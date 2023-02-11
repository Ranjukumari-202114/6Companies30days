/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



197. Rising Temperature


# Write your MySQL query statement below


select W1.Id
from Weather  W1, Weather  W2
where DATEDIFF(W1.recordDate , W2.recordDate) = 1 and W1.Temperature> W2.Temperature
