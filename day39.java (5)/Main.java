/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//Leetcode 876. Middle of Linked List



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
      int len = 0;
      //find the length of the linkedlist

     /* ListNode current = head;
      while(current != null)
      {
          len++;
          current = current.next;
      } 


      current = head;
      int mid = len/2;
      for(int i=0;i<mid;i++)
      {
          current = current.next;
      } 
      return current;
    
    */
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow;

    }
}