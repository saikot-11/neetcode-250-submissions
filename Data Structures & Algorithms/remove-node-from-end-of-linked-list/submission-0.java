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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;

        while (n-- > 0) {
            curr = curr.next;
        }

        ListNode nthNode = head;
        ListNode prev = null;

        while (curr != null) {
            prev = nthNode;
            nthNode = nthNode.next;
            curr = curr.next;
        }

        if (nthNode == head) {
            return head.next;
        }

        prev.next = nthNode.next;
        return head;
    }
}
