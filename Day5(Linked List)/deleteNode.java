
class deleteNode {
    public void deleteNode1(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}