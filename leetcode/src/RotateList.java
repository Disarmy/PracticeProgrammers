public class RotateList {
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

    public ListNode rotateRight(ListNode head, int k) {
        ListNode last = head;

        if (head == null || k == 0) {
            return head;
        }

        //n = 리스트의 길이
        int n = 1;
        while (last.next != null) {
            last = last.next;
            n++;
        }

        k = n - (k % n);

        ListNode prev = head;
        for (int i = 1; i < k; i++) {
            prev = prev.next;
        }

        last.next = head;
        head = prev.next;
        prev.next = null;

        return head;
    }
}
