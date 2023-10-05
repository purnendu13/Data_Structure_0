class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
    public Node(int value,Node next){
        this.value=value;
        this.next=next;

    }
}

public class LPratice {
    Node head;
    Node tail;
    int size;
    public void LPratice(){
       this.size=0;
    }
    public void AddAtf(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
    }
    public void disply(){
        Node temp=head;
        while (temp!=null){
        System.out.print(temp.value+"->");
        temp=temp.next;
        }
        System.out.println("END");
    }
    public void addl(int value){
        if(tail==null){
            AddAtf(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        node=tail;
        size++;
    }
    public void reverse(){
        if(size<2){
            return;
        }
        Node prev=null;
        Node present=head;
        Node next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        prev=head;
    }
    public void AddAtAny(int value ,int index){
        if(index==0)
        {
            AddAtf(value);
            return;
        }
        if(index==size){
            addl(value);
            return;
        }
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;

        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;

    }
    public int DeleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }

    public static void main(String[] args) {
        LPratice x=new LPratice();
        x.AddAtf(4);
        x.AddAtf(7);
        x.AddAtf(5);
        x.AddAtf(7);
        x.disply();
        x.addl(8);
        x.disply();
        x.reverse();
        x.disply();
        x.AddAtAny(100,2);
        x.disply();
        System.out.println(x.DeleteFirst());
        x.disply();


    }
}
