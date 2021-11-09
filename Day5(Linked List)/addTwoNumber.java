
class addTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode c=dummy;
        ListNode c1=l1,c2=l2;
        int carry=0;
        while(c1!=null || c2!=null || carry!=0){
            int value=((c1!=null)?c1.val:0)+((c2!=null)?c2.val:0)+carry;
            ListNode newNode=new ListNode(value%10);
            carry=value/10;
            c.next=newNode;
            c=c.next;
            c1=(c1!=null)?c1.next:c1;
            c2=(c2!=null)?c2.next:c2;
        }
        ListNode nhead=dummy.next;
        dummy.next=null;
        return nhead;
    }
}