public class Convert_2dArrayinto_1d {
    public static void main(String[] args) {
        int td[][]={{1,2,},{3,4}};
        int arr[]=new int[td.length* td[0].length];
        int k=0;
        for(int i=0;i<td.length;i++){
            for(int j=0;j<td[0].length;j++){
                arr[k]=td[i][j];
                k++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int two[][]={{2}};
        System.out.println(two[0][0]);

    }
}
