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
    private ListNode newHead;
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

        ListNode curr = head;
        ListNode nextNode = reverse(curr.next);

        if (nextNode == null) {
            newHead = curr;
        } else {
            curr.next = null;
            nextNode.next = curr;
        }

        return curr;
    }
}
