import java.util.ArrayList;

public class Stack_using_ArrayList {
    static class CustomStack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean IsEmpty(){
            return list.size()==0;

        }
        public static void push(int data){
            list.add(data);
        }
        public  static int pop(){
            if(IsEmpty())
                return -1;
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peak(){
            if(IsEmpty())
                return -1;
            return list.get(list.size()-1);

        }

    }
    public static void main(String[] args) {
        CustomStack s=new CustomStack();
        s.push(7);
        s.push(8);
        s.push(5);
        s.push(3);
        while (!s.IsEmpty()){
            System.out.println(s.peak());
            s.pop();
        }



    }
}
