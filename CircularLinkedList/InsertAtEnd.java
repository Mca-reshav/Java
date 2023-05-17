package CircularLinkedList;

public class InsertAtEnd {
    private ListNode last;
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
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertAtEnd(int value){
        ListNode newNode=new ListNode(value);
        if(last==null){
            last=newNode;
            last.next=last;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
    }
    public static void main(String[] args) {
        System.out.println("Insert a node at the end");
        InsertAtEnd i=new InsertAtEnd();
        i.insertAtEnd(1);
        i.insertAtEnd(2);
        i.insertAtEnd(3);
        i.insertAtEnd(4);
        i.display();
    }
}
