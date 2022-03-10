public class AddTwoNumbers {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = head;

        int sum;
        boolean flag = false;
        while (l1 != null || l2 != null) {

            sum = 0;
            if (flag) {
                sum++;
                flag = false;
            }

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum >= 10) {
                flag = true;
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        if (flag) {
            curr.next = new ListNode(1);
        }

        return head.next;
    }
}
