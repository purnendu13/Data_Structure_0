public class MeargeSort {
    public static void main(String[] args) {
        int arr[]={10,40,50,20,30};
        int n=arr.length;
    }
    // Mearge sort's devide rule where we have to pass starting index and ending index and calculate mid
    public static void Devide(int arr[],int s,int e){
        if(s>e)
            return;
        int mid =s+(e-s)/2;
        Devide(arr,s,mid);
        Devide(arr,mid+1,e);
        conqure(arr,s,mid,e);

    }
    public static void conqure(int arr[],int s,int mid,int e){


    }
}
