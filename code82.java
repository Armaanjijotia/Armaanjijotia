class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Dummy node to handle edge cases (e.g., duplicates at head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy; // last node known to be distinct
        
        while (head != null) {
            // Check if current node is start of duplicates
            if (head.next != null && head.val == head.next.val) {
                
                // Skip all nodes with same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                
                // Skip the last duplicate
                prev.next = head.next;
            } else {
                // No duplicate, move prev forward
                prev = prev.next;
            }
            
            // Move head forward
            head = head.next;
        }
        
        return dummy.next;
    }
}