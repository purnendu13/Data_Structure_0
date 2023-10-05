public class BubbelSort {
    public static void main(String[] args) {
        int arr[]={10,50,40,20};
        bs(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void bs(int arr[]){
        int temp;
        // applying bubbel sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
