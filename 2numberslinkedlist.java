class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy head for result list
        ListNode current = dummy;          // Pointer to build the list
        int carry = 0;                     // Carry for sum > 9

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;  // Add l1 value
                l1 = l1.next;   // Move l1 pointer
            }

            if (l2 != null) {
                sum += l2.val;  // Add l2 value
                l2 = l2.next;   // Move l2 pointer
            }

            // Create a new node with current digit
            current.next = new ListNode(sum % 10);

            carry = sum / 10;  // Update carry
            current = current.next; // Move pointer
        }

        return dummy.next; // Skip dummy node
    }

    // Utility function to print list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Create first list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Create second list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = sol.addTwoNumbers(l1, l2);

        sol.printList(result); // Output: 7 -> 0 -> 8 -> null
    }
}
