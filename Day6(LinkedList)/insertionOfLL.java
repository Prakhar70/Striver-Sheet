
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class insertionOfLL {
    private int sizeofLL(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=sizeofLL(headA);
        int sizeB=sizeofLL(headB);
        ListNode Adash=headA;
        ListNode Bdash=headB;
        if(sizeA>sizeB){
            int count=sizeA-sizeB;
            while(count-->0){
                Adash=Adash.next;
            }
        }
        else{
            int count=sizeB-sizeA;
            while(count-->0){
                Bdash=Bdash.next;
            }
        }
        while(Adash!=null){
            if(Adash==Bdash){
                return Adash;
            }
            Bdash=Bdash.next;
            Adash=Adash.next;
            
        }
        return null;
    }
}