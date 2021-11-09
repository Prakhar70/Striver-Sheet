class ListNode {
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

class merge2sortedLL {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode c = dummy;
        ListNode c1 = l1, c2 = l2;
        while (c1 != null && c2 != null) {
            if (c1.val <= c2.val) {
                c.next = c1;
                c = c.next;
                c1 = c1.next;
            } else {
                c.next = c2;
                c = c.next;
                c2 = c2.next;
            }
        }
        if (c1 == null) {
            c.next = c2;

        }
        if (c2 == null) {
            c.next = c1;
        }
        ListNode nhead = dummy.next;
        dummy.next = null;
        return nhead;
    }
}