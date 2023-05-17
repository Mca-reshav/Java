package SinglyLinkedList;

public class DeleteFirstNode {
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
    public void deleteFirst(){
        ListNode current=head;
        head=current.next;
        current.next=null;

        //or
        //head=head.next;
    }
    public static void main(String[] args) {
        System.out.println("Delete the first node of an singly linked list");
        DeleteFirstNode dfn=new DeleteFirstNode();
        dfn.head=new ListNode(20);
        ListNode second=new ListNode(45);
        ListNode third=new ListNode(25);
        ListNode fourth=new ListNode(15);

        dfn.head.next=second;
        second.next=third;
        third.next=fourth;

        dfn.display();
        dfn.deleteFirst();
        dfn.display();
    }
}
