import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicate_Using_Hash_map {
    public static void main(String[] args) {
        int arr[]={4,5,7,5,3,4,6,7};
        HashSet<Integer> x=new HashSet<>();
        for (int i=0;i< arr.length;i++){
            x.add(arr[i]);
        }
        System.out.println(x);

    }
}
