/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



175. Combine Two Tables

// Write your MySQL query statement below

select Person.firstName,Person.lastName , Address.city,Address.state from Person LEFT JOIN Address ON Person.personId = Address.personId



1148. Article Views I

// Write your MySQL query statement below

select author_id as id
from Views
where author_id = viewer_id
group by author_id
order by author_id asc



1581. Customer Who Visited but Did Not Make Any Transactions

// Write your MySQL query statement below

SELECT v.customer_id, COUNT(v.visit_id) AS
count_no_trans
FROM Visits v
LEFT JOIN Transactions  t
ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id


