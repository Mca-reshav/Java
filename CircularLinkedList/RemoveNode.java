package CircularLinkedList;

import java.util.NoSuchElementException;

public class RemoveNode {
    private ListNode last;
    private int length;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
    public void display(){
        ListNode current=last.next;
        while(current!=last){
            current=current.next;
            System.out.print(current.data+"-->");
        }
        System.out.println("null");
        System.out.println("length:"+length);
    }
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if(last==null){
            last=newNode;
        }else{
            newNode.next=last.next;
        }
        last.next=newNode;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("Empty list");
        }
        ListNode current=last.next;
        if(last.next==last){
            last=null;
        }else{
            last.next=current.next;
        }
        current.next=null;
        length--;

    }
    public static void main(String[] args) {
        System.out.println("Remove a node from a circular linked list");
        RemoveNode rn=new RemoveNode();
        rn.insertFirst(10);
        rn.insertFirst(20);
        rn.insertFirst(30);
        rn.insertFirst(40);
        rn.insertFirst(50);
        rn.insertFirst(60);
        rn.display();
        rn.removeFirst();
        rn.display();

    }
}
