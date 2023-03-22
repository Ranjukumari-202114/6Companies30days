/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1667. Fix Names in a Table




// Write your MySQL query statement below

select user_id,concat(upper(substr(name,1,1)),lower(substr(name,2))) as name from Users order by user_id


