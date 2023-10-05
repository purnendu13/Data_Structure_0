public class Queue_using_Array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int size){
            arr=new int[size];
            this.size=size;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }
        //enqueue (Add)
        public static void add(int data){
            if(rear==size-1){
                System.out.println("full queue");
            return;
            }

             rear++;
             arr[rear]=data;

        }
        public static int remove(){
            if(isEmpty())
                return -1;

                int front=arr[0];
                for (int i = 0; i < rear; i++) {
                    arr[i]=arr[i+1];
                }
                rear--;    
            return front;

        }
        public static int peak(){
            if(isEmpty())
                return -1;
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(7);
        q.add(8);
        q.add(0);
        while (!q.isEmpty()){
            System.out.println(q.peak());
            q.remove();
        }



    }
}
