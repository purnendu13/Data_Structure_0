import java.math.BigInteger;

public class Convert {
    public static void main(String[] args) {
        String x="+400";
        String y="2";
        int i=Integer.parseInt(x);
        int j=Integer.parseInt(y);

        System.out.println(i);

        BigInteger a=new BigInteger(x);
        BigInteger b=new BigInteger(y);
        System.out.println(a.multiply(b));


//        BigInteger x= new BigInteger(num1);
//        BigInteger x1= new BigInteger(num2);
//        return ""+x.multiply(x1);

    }
}
