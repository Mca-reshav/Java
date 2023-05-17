package CircularLinkedList;

public class InsertAtBegin {
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
    public InsertAtBegin(){
        last=null;
        length=0;
    }
    public void insertAtBegin(int data){
        ListNode newNode=new ListNode(data);
        if(last==null){
            last=newNode;
        }else {
            newNode.next = last.next;
        }
            last.next = newNode;
            length++;
    }
    public static void main(String[] args) {
        System.out.println("Insert a node at beginning");
        InsertAtBegin i=new InsertAtBegin();
        i.insertAtBegin(1);
        i.insertAtBegin(2);
        i.insertAtBegin(3);
        i.insertAtBegin(4);
        i.display();
    }
}
