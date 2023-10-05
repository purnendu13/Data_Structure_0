import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        //A a1=new A();
        //return 0;
       // String a="Mant1y";
        int c=0;

//        String [] x= {"manty","megha","mama"};
//        String ch="ma";
//        for (int i = 0; i < x.length; i++) {
//            if(x[i].equalsIgnoreCase(ch))
//                c++;
//
//        }
//        System.out.println(c);

        String x="mantyy";
        String y="manty";
        HashSet<Integer> z=new HashSet<>();
        z.add(2);
        z.add(6);
        z.add(7);
        System.out.println(z);
        int arr[]= new int[z.size()];
        StringBuilder sb=new StringBuilder();
        char []chaA=x.toCharArray();
        char []chaB=y.toCharArray();

        HashSet<Character> m=new HashSet<>();
        for (char i:chaA) {
            m.add(i);
        }

        System.out.println(m);
        Arrays.sort(chaB);
        System.out.println(chaB);


    }


}

