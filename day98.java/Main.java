/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1211. Queries Quality and Percentage



# Write your MySQL query statement below


select query_name, 
    round(sum(rating/position)/count(query_name), 2) as quality,
    round(100*sum(if(rating < 3, 1, 0))/count(query_name), 2) as poor_query_percentage
from Queries
group by query_name