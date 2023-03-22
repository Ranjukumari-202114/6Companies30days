/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//1527. Patients With a Condition



select patient_id,patient_name,conditions
from Patients
where conditions like 'DIAB1%' or conditions like '% DIAB1%';