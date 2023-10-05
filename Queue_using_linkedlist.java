public class Queue_using_linkedlist {
    static class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
        }
    }
    static class Queuy{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void add(int data){


            Node newNode=new Node(data);
            if(tail==null){
                tail=head=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public static int remove(){
            if(isEmpty())
                return -1;
            int front= head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;

        }
        public static int peak(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queuy x=new Queuy();
        x.add(7);
        x.add(8);
        x.add(9);
        x.add(4);
        x.add(2);
        while (!x.isEmpty()){
            System.out.println(x.peak());
            x.remove();
        }

    }
}
