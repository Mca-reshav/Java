package SinglyLinkedList;

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void display(ListNode head){     //public void display(){...}
        ListNode current=head;
        int count=0;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
            count++;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("Length of list: "+count);


    }/*
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void deleteFirst(){
        ListNode current=head;
        head=current.next;
        current.next=null;
    }
    public ListNode deleteLast(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(null!=current.next){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;

    }*/
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
        System.out.println("Singly linked list");
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(1);
        ListNode second=new ListNode(10);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);

        //Now we will connect them together to form a chain

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        /*
        sll.display();
        sll.insertFirst(15);
        sll.display();
        sll.insertLast(35);
        sll.display();
        sll.deleteFirst();
        sll.display();
        sll.deleteLast();
        sll.display();
        */

        ListNode rl=sll.reverseList(sll.head);
        sll.display(rl);

    }
}
