/*
Singly linked list: It is a linear data structure used for storing collection of nodes and has the following properties:
 1. It contains a sequence of nodes.
 2. A node has a data and reference to next node in a list.
 3. First node is the head node.
 4. Last node has data and points to null
  _____________
 | data | next|
 -------------

 head
   |
   |
   v
  ___________      __________     ___________     ____________
 | 10 |     |---->| 1 |     |---->| 8 |     |---->| 11 |     |---->null
 -----------      ----------     -----------     ------------

 ListNode

 public class ListNode{
 private int data;
 private ListNode next;
 }

 head is instance variable

 head=new ListNode(10);
 ListNode second=new ListNode(1);
 ListNode third=new ListNode(8);
 ListNode fourth=new ListNode(11);

 head.next=second;
 second.next=third;
 third.next=fourth;

 print elements

 ListNode current=head;
 while(current!=null){
    System.out.print(current.data+ "-->");
    current=current.next();
   }
   System.out.print("null");
 */



package SinglyLinkedList;

public class SinglyLinkedListIntro {
    public static void main(String[] args) {
        System.out.println("Introduction to singly linked list");
    }
}
