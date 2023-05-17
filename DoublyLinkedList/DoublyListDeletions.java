package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyListDeletions {
    private ListNode head;
    private ListNode tail;
    private int length;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data=data;
        }
    }
    public void showHead(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
        System.out.println("length:"+length);
    }
    public void showTail(){
        ListNode current=tail;
        while(current!=null){
            System.out.print(current.data+"<--");
            current=current.previous;
        }
        System.out.println("null");
        System.out.println("length:"+length);
    }
    private void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if(length==0){
            tail=newNode;
        }else{
           head.previous=newNode;
        }
       newNode.next=head;
        head=newNode;
        length++;
    }
    public void deleteFirst(){
        ListNode current=head;
        if(length==0){
            throw new NoSuchElementException("empty");
        }
        if(head==tail){
            tail=null;
        }else{
            head.next.previous=null;
        }
        head=head.next;
        current.next=null;
        length--;
    }
    public void deleteLast(){
        if(length==0){
            throw new NoSuchElementException("Empty");
        }
        ListNode current=tail;
        if(head==tail){
            head=null;
        }else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        current.previous=null;
        length--;
    }
    public static void main(String[] args) {
        System.out.println("Doubly Linked List deletion at the beginning and end");
        DoublyListDeletions dld=new DoublyListDeletions();
        dld.insertFirst(10);
        dld.insertFirst(20);
        dld.insertFirst(30);
        dld.insertFirst(40);
        dld.insertFirst(50);
        dld.showHead();
        dld.showTail();
        dld.deleteFirst();
        dld.showHead();
        dld.showTail();
        dld.deleteLast();
        dld.showHead();
        dld.showTail();
    }
}
