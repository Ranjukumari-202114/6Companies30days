/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



//21. Merge Two Sorted Lists


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     if(list1==null)
           return list2;
        if(list2==null)
            return list1;
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }      
    }
}