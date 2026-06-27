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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2_tail = list2;
        while(list2_tail!=null && list2_tail.next!=null){
            list2_tail = list2_tail.next;
        }

        ListNode temp_a = list1, temp_b = list1;

        for(int i=1; i<a; i++){
            temp_a = temp_a.next;
        }
        for(int i=0; i<=b; i++){
            temp_b = temp_b.next;
        }
        temp_a.next = list2;
        list2_tail.next = temp_b;

        return list1;

    }
}