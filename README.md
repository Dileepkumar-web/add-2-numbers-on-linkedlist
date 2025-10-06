# add-2-numbers-on-linkedlist
This project provides a Java implementation to add two non-negative integers represented as singly linked lists.
Solution Approach

The solution uses a brute-force iterative approach:

Dummy Node: Create a dummy node to simplify linked list construction.

Iterate Through Lists: Traverse both linked lists simultaneously.

Sum Digits: At each node, sum l1.val + l2.val + carry.

Create New Node: Add sum % 10 as a new node to the result list.

Update Carry: carry = sum / 10.

Continue: Move to the next nodes of l1 and l2 until both are null and carry is zero.
