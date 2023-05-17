package SinglyLinkedList;

public class InsertAtGivenPos {
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
        int count=0;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
            count++;
        }
        System.out.println("null");
        System.out.println("Length: "+count);
    }
    public void insertAtGivenPos(int position,int value){
        ListNode newNode=new ListNode(value);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }else{
            ListNode previous=head;
            int count=1;
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=newNode;
            newNode.next=current;
        }
    }
    public static void main(String[] args) {
        System.out.println("Insert a node at the given position");
        InsertAtGivenPos iagp=new InsertAtGivenPos();

        iagp.head=new ListNode(20);
        ListNode second=new ListNode(15);
        ListNode third=new ListNode(45);
        ListNode fourth=new ListNode(25);

        iagp.head.next=second;
        second.next=third;
        third.next=fourth;

        iagp.display();
        iagp.insertAtGivenPos(1,60);
        iagp.display();
        iagp.insertAtGivenPos(3,50);
        iagp.display();
    }
}
