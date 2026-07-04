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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        l1 = reverse(l1);
        l2 = reverse(l2);

        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(l1!=null && l2!=null){
            int sum = carry + l1.val + l2.val;
            carry = (sum>9)?1:0;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int sum = carry + l1.val;
            carry = (sum>9)?1:0;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            l1 = l1.next;
        }
        while(l2!=null){
            int sum = carry + l2.val;
            carry = (sum>9)?1:0;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            l2 = l2.next;
        }

        if(carry == 1){
            curr.next = new ListNode(carry);
        }

        dummy = dummy.next;


        return reverse(dummy);
        
    }
    private static ListNode reverse(ListNode list){
        ListNode prev = null;
        ListNode curr = list;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    private static void print(ListNode list){
        while(list!=null){
            System.out.print(list.val +"  ");
            list = list.next;
        }
    }
}