/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/






class Solution {
    
    // time and space complexity is O(N)

   /* public boolean isPalindrome(ListNode head) {
     if(head == null || head.next == null) return true;
     List<Integer> lst = new ArrayList<>(); 
     while(head != null)
     {
         lst.add(head.val);
         head = head.next;
     } 
     int start = 0, end = lst.size()-1;
     while(start<end)
     {
        if(lst.get(start) != lst.get(end)) return false;
        start++;
        end--;

     }
     return true;    
      

    }
    */
    
    
    
    
    //Time complexity is O(N)  and space complexity is O(1)
    
 public boolean isPalindrome(ListNode head) {

     //find mid

    ListNode fast = head;
    ListNode slow= head;

    while(fast.next != null && fast.next.next != null)
    {
        slow = slow.next;
        fast = fast.next.next;

    }
    if(fast != null) slow = slow.next;

    ListNode revHead = reverse(slow);
    
    while(revHead != null)
    {
        if(revHead.val != head.val) return false;
        else{
            revHead = revHead.next;
            head = head.next;
        }
    }
    return true;
 }
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        while(head != null)
        {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
 
}