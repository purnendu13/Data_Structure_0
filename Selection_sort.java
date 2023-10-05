public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={9,5,4,3,6,1};
        SS( arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void SS(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[j]<min){
                    min=j;

            }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }
}
