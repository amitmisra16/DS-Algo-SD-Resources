package gtci.two.pointers;

import static gtci.two.pointers.I01CycleInSinglyLinkedList.calculateLength;

class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
public class I01CycleInSinglyLinkedList {

    public static boolean hasCycle(ListNode head) {
        boolean isCyclic = false;
        if (head.next == null) {
            return isCyclic;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isCyclic = true;
                break;
            }
        }
        return isCyclic;
    }

    public static int cycleLength(ListNode head) {
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return I01CycleInSinglyLinkedList.calculateLength(slow);
            }
        }
        return 0;
    }

    static int calculateLength(ListNode node) {
        ListNode currentNode = node;
        int length = 0;
        do {
            currentNode = currentNode.next;
            length ++;
        } while (currentNode != node);
        return length;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println(hasCycle(head));
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(hasCycle(head));
        System.out.println(cycleLength(head));
    }
}
