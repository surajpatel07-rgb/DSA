class Solution {
    public ListNode getmid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        // 0 or 1 node is always a palindrome
        if (head == null || head.next == null) return true;

        // find mid
        ListNode list2 = getmid(head);

        // separate list1 and list2: stop at the node BEFORE mid
        ListNode temp = head;
        while (temp.next != list2) {   // fixed condition
            temp = temp.next;
        }
        temp.next = null;

        // reverse second half
        ListNode head2 = reverse(list2);

        // compare
        ListNode temp1 = head;
        ListNode temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val != temp2.val) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}