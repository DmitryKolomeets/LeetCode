package Easy._83_Remove_Duplicates_From_Sorted_list;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head;
        while (current_node != null && current_node.next != null) {
            if (current_node.next.val == current_node.val) {
                current_node.next = current_node.next.next;
            } else {
                current_node = current_node.next;
            }
        }

        return head;
    }


}


