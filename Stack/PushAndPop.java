package Stack;

import java.util.EmptyStackException;

public class PushAndPop {
    private ListNode top;
    private int length;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
   public void push(int value){
        ListNode newNode =new ListNode(value);
        newNode.next=top;
        top=newNode;
        length++;
   }
   public int pop(){
        if(length==0){
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
   }
   public void show(){
       if(length==0){
           throw new EmptyStackException();
       }else{
           ListNode current=top;
           while(current!=null){
               System.out.println("|"+current.data+"|");
               current=current.next;
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
        System.out.println("Push and Pop method of stack");
        PushAndPop p=new PushAndPop();
        p.push(10);
        p.push(15);
        p.push(25);
        p.push(40);
        p.show();
        System.out.println(p.pop());
        p.show();
        p.push(45);
        p.show();
    }
}
