public class Stack_Using_LinkList {
    public static class Node{
        int data;
        Node next;
       public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class CustomStack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public static int pop(){
            if(isEmpty())
                return -1;
            int top= head.data;
            head=head.next;
            return top;
        }
        public static int peak(){
            if(isEmpty())
                return -1;
            return head.data;
        }
    }
    public static void main(String[] args) {
        CustomStack s=new CustomStack();
        s.push(1);
        s.push(2);
        s.push(7);
        s.push(6);
        while (!s.isEmpty()){
            System.out.println(s.peak());
            s.pop();
        }
    }
}
