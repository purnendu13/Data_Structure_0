//
//class Node{
//    int value;
//    Node next;
//
//    public Node(int value) {
//        this.value = value;
//    }
//
//    public Node(int value, Node next) {
//        this.value = value;
//        this.next = next;
//    }
//}
//
//
//public class LList {
//    Node head;
//    Node tail;
//    int size;
//    public LList(){
//        this.size=0;
//    }
//    public void insrtf(int value){
//        Node node=new Node(value);
//        node.next=head;
//        head=node;
//        if (tail==null){
//            tail=head;
//        }
//
//    }
//    public void display(){
//        Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.value+"->");
//            temp=temp.next;
//        }
//        System.out.println("end");
//    }
//    public static void main(String[] args) {
//      LList x=new LList();
//      x.insrtf(3);
//      x.insrtf(9);
//      x.insrtf(6);
//      x.display();
//    }
//}
