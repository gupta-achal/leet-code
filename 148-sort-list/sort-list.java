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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null){return head;}
        ListNode left = head;
        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left,right);

    }
    private static ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(left!=null && right!=null){
            if(left.val <= right.val){
                curr.next = new ListNode(left.val);
                left = left.next;
            }else{
                curr.next = new ListNode(right.val);
                right = right.next;
            }
            curr = curr.next;
        }
        if(left!=null){
            curr.next = left;
        }
        if(right!=null){
            curr.next = right;
        }

        return dummy.next;

    }
}