package SinglyLinkedList;

public class FindMidNode {
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
        head=new ListNode(10);
        ListNode second=new ListNode(30);
        ListNode third=new ListNode(20);
        ListNode fourth=new ListNode(40);
        ListNode fifth=new ListNode(15);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
    }
    public ListNode getMidNode(){
        if(head==null){
            return null;
        }
            ListNode slowPtr=head;
            ListNode fastPtr=head;
            int count=1;
            while(fastPtr!=null && fastPtr.next!=null){
                slowPtr=slowPtr.next;
                fastPtr=fastPtr.next.next;
                count++;
            }
            System.out.println("Middle at position:"+count);
            return slowPtr;


    }
    public static void main(String[] args) {
        System.out.println("Find middle node of a singly linked list");
        FindMidNode fmn=new FindMidNode();
        fmn.addNodes();
        fmn.display();
        ListNode midNode=fmn.getMidNode();
        System.out.println("Middle Node:"+midNode.data);
    }
}
