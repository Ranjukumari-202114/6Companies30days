/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1795. Rearrange Products Table



# Write your MySQL query statement below



select * from 
(
    select product_id, 'store1' store, store1 price from Products
    union 
    select product_id, 'store2' store, store2 price from Products
    union
    select product_id, 'store3' store, store3 price from Products
)t 
where price is not null;