class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int index = size(head) - n;

        if (index == 0) {
            return head.next;
        }

        ListNode curr = head;

        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }

    private int size(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
}