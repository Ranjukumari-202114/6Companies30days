/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public ListNode swapPairs(ListNode head) {
       if(head == null || head.next == null)   
        return head;
 
    ListNode h = new ListNode(0);
    h.next = head;
    ListNode p = h;
 
    while(p.next != null && p.next.next != null){
        //use t1 to track first node
        ListNode t1 = p;
        p = p.next;
        t1.next = p.next;
 
        //use t2 to track next node of the pair
        ListNode t2 = p.next.next;
        p.next.next = p;
        p.next = t2;
    }
 
    return h.next;  
        
    }
}