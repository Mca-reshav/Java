package SinglyLinkedList;

public class InsertLastNode {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public static void main(String[] args) {
        System.out.println("Insert a new node at the end of the singly linked list");
        InsertLastNode iln=new InsertLastNode();

        iln.head=new ListNode(30);
        ListNode second=new ListNode(40);
        ListNode third=new ListNode(20);
        ListNode fourth=new ListNode(50);

        iln.head.next=second;
        second.next=third;
        third.next=fourth;
        iln.display();

        iln.insertLast(15);
        iln.insertLast(35);
        iln.display();
    }
}
