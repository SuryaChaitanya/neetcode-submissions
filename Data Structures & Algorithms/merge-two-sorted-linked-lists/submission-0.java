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
        if (list1 == null || list2 == null)
            return list1 == null ? list2 : list1;
        ListNode cur;
        if (list1.val < list2.val)
        {
            cur = new ListNode(list1.val);
            list1 = list1.next;
        }
        else {
            cur = new ListNode(list2.val);
            list2 = list2.next;
        }

        ListNode result = cur;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ListNode temp = new ListNode(list1.val);
                result.next = temp;
                result = temp;
                list1 = list1.next;
            }
            else {
                ListNode temp = new ListNode(list2.val);
                result.next = temp;
                result = temp;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            ListNode temp = new ListNode(list1.val);
            result.next = temp;
            result = temp;
            list1 = list1.next;
        }
        while (list2 != null) {
            ListNode temp = new ListNode(list2.val);
            result.next = temp;
            result = temp;
            list2 = list2.next;
        }
        return cur;
    }
}