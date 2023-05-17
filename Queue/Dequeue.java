package Queue;

import java.util.NoSuchElementException;

public class Dequeue {
    private ListNode front;
    private ListNode rear;
    private int length;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void enqueue(int value){
        ListNode newNode =new ListNode(value);
        if(length==0){
            front=newNode;
        }else{
            rear.next=newNode;
        }
        rear=newNode;
        length++;
    }
    public int dequeue(){
        if(length==0){
            throw new NoSuchElementException("Queue is empty");
        }
        int result=front.data;
        front=front.next;
        System.out.println("length:"+length);
        if(front==null){
            rear=null;
        }
        length--;
        return result;
    }
    public void display(){
        ListNode current=front;
        System.out.print("exit<--");
        while(current!=null){
            System.out.print(current.data+"<--");
            current=current.next;
        }
        System.out.println("entry");
    }
    public static void main(String[] args) {
        System.out.println("Dequeue a queue");
        Dequeue d=new Dequeue();
        d.enqueue(1);
        d.enqueue(2);
        d.enqueue(3);
        d.enqueue(4);
        d.enqueue(5);
        d.display();
        System.out.println("dequeue:"+d.dequeue());
        d.display();
        d.enqueue(6);
        d.display();
    }
}
