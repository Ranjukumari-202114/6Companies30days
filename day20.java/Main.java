/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



595. Big Countries SQL problem leetcode

// Write your MySQL query statement below
SELECT name, population, area FROM  World WHERE area>=3000000 or population>=25000000



1757. Recyclable and Low Fat Products leetcode problem

// Write your MySQL query statement below

SELECT product_id FROM Products WHERE low_fats='Y' and recyclable= 'Y'




584. Find Customer Referee

// Write your MySQL query statement below

SELECT name from Customer where referee_id != 2 or referee_id is null




183. Customers Who Never Order
// Write your MySQL query statement below

SELECT c.name AS  Customers FROM Customers c WHERE c.id NOT IN (SELECT customerId FROM Orders)