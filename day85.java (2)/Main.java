/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1068. Product Sales Analysis I


//# Write your MySQL query statement below



SELECT Product.product_name,Sales.year, Sales.price
FROM Sales
INNER JOIN Product ON Sales.product_id = Product.product_id;