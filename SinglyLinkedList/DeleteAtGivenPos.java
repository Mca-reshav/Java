package SinglyLinkedList;

public class DeleteAtGivenPos {
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
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void addNode(){
        head=new ListNode(35);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(10);
        ListNode fourth=new ListNode(30);

        head.next=second;
        second.next=third;
        third.next=fourth;
    }

    public void deleteAtPos(int pos){
        if(pos==1){
           head=head.next;
        }else{
            ListNode previous=head;
            int count=1;
            while(count<pos-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;
        }
    }
    public static void main(String[] args) {
        System.out.println("Delete a node at given position");
        DeleteAtGivenPos dagp=new DeleteAtGivenPos();
        dagp.addNode();
        dagp.display();
        dagp.deleteAtPos(1);
        dagp.display();
        dagp.deleteAtPos(3);
        dagp.display();
    }
}
