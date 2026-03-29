class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            curr.next = second;

            // Move to next pair
            curr = first;
        }

        return dummy.next;
    }
}
