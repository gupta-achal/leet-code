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
    public ListNode swapNodes(ListNode head, int k) {
        int r = size(head) - k+1;
        ListNode first = head, second = head;
        for(int i=1; i<k; i++){
            first = first.next;
        }
        for(int i=1; i<r; i++){
            second = second.next;
        }

        // System.out.println(first.val);
        // System.out.println(second.val);

        int tmp = first.val;
        first.val = second.val;
        second.val = tmp;

        return head;

    }
    private static int size(ListNode head){
        int size = 0;
        while(head!=null){
            size ++;
            head = head.next;
        }
        return size;
    }
}