
class removeNthfromlast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode prev=head;
        ListNode frwd=head;
        int count=n;
        while(count!=0){
            frwd=frwd.next;
            count--;
        }
        if(frwd==null){
            ListNode nhead=head.next;
            head.next=null;
            return nhead;
        }
        else{
            while(frwd.next!=null){
                frwd=frwd.next;
                prev=prev.next;
            }
            ListNode rnode=prev.next;
            prev.next=rnode.next;
            rnode.next=null;
        }
        return head;
    }
}