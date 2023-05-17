package SinglyLinkedList;

public class InsertFirstNode {
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
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {
        System.out.println("Insert the first node of a singly linked list");
        InsertFirstNode ifn=new InsertFirstNode();

        ifn.head=new ListNode(20);
        ListNode second=new ListNode(30);
        ListNode third=new ListNode(10);

        ifn.head.next=second;
        second.next=third;
        ifn.display();

        //insert a node at the beginning
       ifn.insertFirst(40);
       ifn.display();
    }
}
