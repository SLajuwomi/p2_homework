public class MyStack {
      private StackNode head;
   
      public MyStack() {
         head= null;
      }
   
      public void push(int val) {
         StackNode p= new StackNode();
         p.data= val;
         p.next= head;
         head= p;
      }

      public int pop() {
         StackNode p= head;
         head= head.next;
         return p.data;
      }
   
      public boolean isEmpty() {
         return head == null;
      }
   }