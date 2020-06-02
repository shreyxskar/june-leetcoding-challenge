/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode newNode = new ListNode(node.next.val);
        newNode.next = node.next.next;
        node.next = newNode.next;  
        node.val = newNode.val;
    }
}
/*
Datastructure   : LinkedList
Time complexity : O(1)
Space complexity: O(1)
Useful link     : https://www.youtube.com/watch?v=ruat4x3OwQc
*/
