package SinglyLinkedList;

public class RemoveDuplicate {
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
    public void addNodes(){
        head=new ListNode(20);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(25);
        ListNode fourth=new ListNode(45);
        ListNode fifth=new ListNode(45);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
    }
    public void removeDuplicate(){
        if(head==null){
            return;
        }
        ListNode current=head;
        while (current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Remove duplicate node from a sorted linked list");
        RemoveDuplicate rd=new RemoveDuplicate();
        rd.addNodes();
        rd.display();
        rd.removeDuplicate();
        rd.display();
    }
}
