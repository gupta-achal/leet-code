class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int min = Integer.MAX_VALUE;
        int fc = -1, pc = -1;

        ListNode prev = head;
        ListNode curr = head.next;

        int i = 1;

        while (curr != null && curr.next != null) {

            if (maxima(prev, curr)) {

                if (fc == -1) {
                    fc = i;
                } else {
                    min = Math.min(min, i - pc);
                }

                pc = i;
            }

            prev = curr;
            curr = curr.next;
            i++;
        }

        if (fc == -1 || fc == pc) {
            return new int[]{-1, -1};
        }

        return new int[]{min, pc - fc};
    }

    private boolean maxima(ListNode prev, ListNode curr) {
        return (curr.val > prev.val && curr.val > curr.next.val) ||
               (curr.val < prev.val && curr.val < curr.next.val);
    }
}