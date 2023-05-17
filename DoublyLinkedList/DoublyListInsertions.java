package DoublyLinkedList;

public class DoublyListInsertions {
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
    public DoublyListInsertions(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void displayHead(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;

        }
        System.out.println("null");
        System.out.println("Length:"+length);
    }
    public void displayTail(){
        ListNode current=tail;
        System.out.print("null");
        while(current!=null){
            System.out.print("<--"+current.data);
            current=current.previous;
        }
        System.out.println();
        System.out.println("Length:"+length);
    }
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            tail=newNode;
        }else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }
    public void insertLast(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        length++;
    }
    public static void main(String[] args) {
        System.out.println("Insert a node");
        DoublyListInsertions dll=new DoublyListInsertions();
        dll.insertFirst(12);
        dll.insertFirst(15);
        dll.insertFirst(23);
        dll.insertFirst(25);

        //dll.insertLast(50);
        //dll.insertLast(35);
        //dll.insertLast(20);
        //dll.insertLast(40);
        dll.displayHead();
        dll.displayTail();
    }
}
