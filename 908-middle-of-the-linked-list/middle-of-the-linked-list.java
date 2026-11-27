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
    public ListNode middleNode(ListNode head) {
    //     ListNode slow = head;
    //     ListNode fast  = head;
    //     while(fast != null && fast.next !=  null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //   return slow;
    // ArrayList<ListNode> list = new ArrayList<>();
    // ListNode temp = head;
    // while(temp != null){
    //     list.add(temp);
    //     temp = temp.next;
    // }
    // return list.get(list.size()/ 2);
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null){
       fast = fast.next.next;
       slow = slow.next;
    }
    return slow;
    }
}