/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//160. Intersection of Two Linked Lists


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      if(headA == null || headB == null)
          return null;
       ListNode nodeA = headA;
       ListNode nodeB = headB;
        
        while(nodeA!=nodeB){
            
            // When nodeA reaches the end of a list, then
            // reassign it to the headB.
            if(nodeA!=null){
                nodeA = nodeA.next;
            }else{
                nodeA = headB;
            }
            
            // When nodeB reaches the end of a list, then
            // reassign it to the headA.            
            if(nodeB!=null){
                nodeB = nodeB.next;
            }else{
                nodeB = headA;
            }
        }
        return nodeA;
  
    }
}