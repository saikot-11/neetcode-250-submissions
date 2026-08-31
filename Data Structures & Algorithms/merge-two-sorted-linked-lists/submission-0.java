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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = null;
        ListNode curr = null;

        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                if (newHead == null) {
                    newHead = list2;
                    curr = newHead;
                } else {
                    curr.next = list2;
                    curr = curr.next;
                }
                list2 = list2.next;
            } else {
                if (newHead == null) {
                    newHead = list1;
                    curr = newHead;
                } else {
                    curr.next = list1;
                    curr = curr.next;
                }
                list1 = list1.next;
            }
        }

        while (list1 != null) {
            if (curr != null) {
                curr.next = list1;
                curr = curr.next;
            } else {
                newHead = list1;
                curr = list1;
            }
            list1 = list1.next;
        }

        while (list2 != null) {
            if (curr != null) {
                curr.next = list2;
                curr = curr.next;
            } else {
                newHead = list2;
                curr = list2;
            }
            list2 = list2.next;
        }

        return newHead;
    }
}