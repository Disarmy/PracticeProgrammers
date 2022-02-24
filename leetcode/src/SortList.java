import java.util.Collections;
import java.util.LinkedList;

public class SortList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode sortList(ListNode head) {
        LinkedList<Integer> list = new LinkedList<>();
        ListNode node = head;

        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        Collections.sort(list);

        node = head;

        int i = 0;
        while (node != null) {
            node.val = list.get(i++);
            node = node.next;
        }

        return head;
    }
}
