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
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n) for recursion stack
     */
    private ListNode newHead = null;
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        reverse(head);

        return newHead;
    }

    private ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode temp = reverse(head.next);
        ListNode curr = head;

        if (temp == null) {
            newHead = curr;
        } else {
            temp.next = curr;
        }

        curr.next = null;

        return curr;
    }
}
