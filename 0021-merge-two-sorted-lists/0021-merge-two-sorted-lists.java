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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode h1 = head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                h1.next = list1;
                list1 = list1.next;
            }else{
                h1.next = list2;
                list2 = list2.next;
            }
            h1 = h1.next;
        }
        if(list1!=null){
            h1.next = list1;
        }else{
            h1.next = list2;
        }
        return head.next;
    }
}