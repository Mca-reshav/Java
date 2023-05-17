package Queue;

public class Enqueue {
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
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public Enqueue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    public void enqueue(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            front=newNode;
        }else{
            rear.next=newNode;
        }
        rear=newNode;
        length++;
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        ListNode current=front;
        System.out.print("exit<--");
        while(current!=null){
            System.out.print(current.data+"<--");
            current=current.next;
        }
        System.out.println("entry");
        System.out.println("length:"+length);
    }
    public static void main(String[] args) {
        System.out.println("Enqueue a queue");
        Enqueue e=new Enqueue();
        e.enqueue(5);
        e.enqueue(8);
        e.enqueue(3);
        e.enqueue(9);
        e.display();
    }
}
