package SinglyLinkedList;


import java.util.List;

public class DeleteLastNode {
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
    public ListNode deleteLast(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
    public static void main(String[] args) {
        System.out.println("Delete the last node of an singly linked list");
        DeleteLastNode dln=new DeleteLastNode();
        dln.head=new ListNode(30);
        ListNode second=new ListNode(35);
        ListNode third=new ListNode(25);
        ListNode fourth=new ListNode(20);

        dln.head.next=second;
        second.next=third;
        third.next=fourth;
        dln.display();
        dln.deleteLast();
        dln.display();
    }
}
