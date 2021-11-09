
class midLL
{
    int getMiddle(Node head)
    {
         if(head.next==null){
             return head.data;
         }
         Node slow=head;
         Node fast=head;
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow.data;
    }
}

