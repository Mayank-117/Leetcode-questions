public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        
        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break; // Exit early once the meeting point is found
            }
        }
        
        // If no cycle was detected, return null
        if (!hasCycle) {
            return null;
        }
        
        // Step 2: Find the starting node of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow; // Both pointers now point to the start of the cycle
    }
}