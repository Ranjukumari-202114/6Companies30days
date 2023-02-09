/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


//83. Remove Duplicates from Sorted List


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // when list is empty
       /* if(head == null)
        {
            return null;
        }

        ListNode current = head;
      //compare the current node to the next node
        while (current.next != null)
        {
            if (current.val == current.next.val)
            {
               ListNode nextNext = current.next.next;
                current.next = nextNext;
            }
            else {
                current = current.next;    // only advance if no deletion
            }
        }
 
        return head;
       */

        if(head == null || head.next == null) return head;
        
        ListNode list = head;
        
        while(list.next != null) {
            
            if (list.val == list.next.val){
                
                list.next = list.next.next;
            }else {
                
                list = list.next;    
            }
            
        }
        return head; 
    }
}