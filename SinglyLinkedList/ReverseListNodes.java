package SinglyLinkedList;

public class ReverseListNodes {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public static void main(String[] args) {
        System.out.println("Reverse the nodes of a singly linked list");
        ReverseListNodes rln=new ReverseListNodes();
        rln.head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third =new ListNode(30);
        ListNode fourth=new ListNode(40);

        rln.head.next=second;
        second.next=third;
        third.next=fourth;
        rln.display();
        ListNode rl=rln.reverseList(rln.head);
        rln.display(rl);
    }
}
