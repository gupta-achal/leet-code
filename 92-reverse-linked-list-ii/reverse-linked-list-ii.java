class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;

        // Move to node before left
        for (int i = 1; i < left; i++) {
            curr = curr.next;
        }

        ListNode tempHead = curr.next;
        ListNode tail = tempHead;

        // Move tail to right
        for (int i = left; i < right; i++) {
            tail = tail.next;
        }

        ListNode mainTail = tail.next;

        // Detach
        curr.next = null;
        tail.next = null;

        // Reverse
        ListNode newHead = reverse(tempHead);

        // Reconnect
        curr.next = newHead;
        tempHead.next = mainTail;

        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}