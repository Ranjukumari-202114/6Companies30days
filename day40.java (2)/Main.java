/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//206. Reverse Linked List


class Solution {
    public ListNode reverseList(ListNode head) {
     if(head == null || head.next == null)
     {
         return head;
     } 
     ListNode prev= null;
     ListNode curr = head;
     ListNode next;
      while(curr != null)
      {
          next = curr.next;
          curr.next = prev;

          prev = curr;
          curr = next;
      } 
      head = prev;
      return head;
    }
}