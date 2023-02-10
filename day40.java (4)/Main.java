/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

627. Swap Salary



# Write your MySQL query statement below



/*update Salary
set sex =
case
when sex ='m' then 'f'
when sex='f' then 'm'
END
*/



update salary set sex = (if(sex='m','f','m'))