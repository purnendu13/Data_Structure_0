public class Stack_using_LL_p1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class CustomStack{
        public static Node head;
        public static boolean IsEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode =new Node(data);
            if (head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            int top=head.data;
            return top;

        }
    }
    public static void main(String[] args) {
        CustomStack s=new CustomStack();
        s.push(6);
        s.push(8);
        s.push(0);
        s.push(5);
        s.push(3);
        while (!s.IsEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
