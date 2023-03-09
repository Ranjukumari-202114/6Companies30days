/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//141. Linked List Cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
     ListNode fast = head;
     ListNode slow = head;
     while(fast != null && fast.next != null)
     {
         slow = slow.next;
         fast = fast.next.next;
         if(slow == fast)
           return true;
     }
     return false;   
    }
}




