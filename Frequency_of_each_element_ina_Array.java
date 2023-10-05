import java.util.HashMap;
import java.util.Map;

public class Frequency_of_each_element_ina_Array {
    public static void main(String[] args) {
        int arr[]={1,4,5,4,3,2,1,4,2,5};
        HashMap<Integer,Integer> x=new HashMap<>();

        // adding Arrays frequency into Hash map

        for (int i = 0; i < arr.length; i++) {
            if(x.containsKey(arr[i]))
                x.put(arr[i], x.get(arr[i])+1);
            else
                x.put(arr[i],1);
        }

        for (Map.Entry e: x.entrySet()){

            System.out.println(e.getKey() +"" +e.getValue());
        }

    }
}
