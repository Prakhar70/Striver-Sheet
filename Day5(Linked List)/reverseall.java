class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        if(head==null||head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node frwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=frwd;
        }
        return prev;
    }
}