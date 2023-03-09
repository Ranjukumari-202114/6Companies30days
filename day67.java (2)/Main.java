/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//142. Linked List Cycle II





public class Solution {
    public ListNode detectCycle(ListNode head) {
     if(head == null || head.next == null)
        return null;
     ListNode slow = head;
     ListNode fast = head;
     ListNode entry = head;
     while(fast != null && fast.next !=  null)
     {
         slow = slow.next;
         fast = fast.next.next;  
          if(slow == fast)
          {
             while(slow != entry)
             {
                 slow = slow.next;
                 entry = entry.next;
             }
             return entry;
          } 
     } 
      return null;
         
    }
}