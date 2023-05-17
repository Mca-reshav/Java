package CircularLinkedList;

public class CircularLinkedList {
    private ListNode last;
    private int length;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
    public CircularLinkedList(){
        last=null;
        length=0;
    }
    public void createNode(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;  //circular
        last=fourth;    //root node
    }
    public void display(){
        if(last==null){
            return;
        }
        ListNode current=last.next;
        while(current!=last){
            System.out.print(current.data+"-->");
            current=current.next;
            length++;
        }
        System.out.println("null");
        System.out.println("length:"+length);
    }
    public static void main(String[] args) {
        System.out.println("Circular linked list");
        CircularLinkedList c=new CircularLinkedList();
        c.createNode();
        c.display();
    }
}
