import java.util.*;
class reverseNodeinKGroup{
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    static ListNode th=null;
    static ListNode tt=null;
    public static void addFirst(ListNode node){
        if(th==null){
            th=tt=node;
        }
        else{
            node.next=th;
            th=node;
        }
    }

    public static ListNode reverseInKGroup(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode oh=null,ot=null;
        int len=length(head);
        ListNode curr=head;
        while(len>=k){
            int tempk=k;
            while(tempk-->0){
                ListNode forw=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=forw;
            }
            if(oh==null){
                oh=th;
                ot=tt;
            }
            else{
                ot.next=th;
                ot=tt;
            }
            th=null;
            tt=null;
            len-=k;
        }
        ot.next=curr;
        return oh;
    }

    private static int length(ListNode head) {
        int count=0;
        for(ListNode curr=head;curr!=null;curr=curr.next){
            count++;
        }
        return count;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);

        int k = scn.nextInt();
        h1 = reverseInKGroup(h1, k);
        printList(h1);
    }
}