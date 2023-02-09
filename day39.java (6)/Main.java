/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//1290. Convert Binary Number in a Linked List to Integer




class Solution {
    public int getDecimalValue(ListNode head) {
       int result = 0;
        while (head != null) {
            result = result << 1;
            result += head.val;
            head = head.next;
        }
        return result; 
    }
}