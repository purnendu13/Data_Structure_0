public class Rotate_Array_90Degree {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length;
        int n=arr[0].length;
        int Rotate[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                System.out.print(arr[j][i] +" ");
               // System.out.println(" ");

            }

        }


    }
}
