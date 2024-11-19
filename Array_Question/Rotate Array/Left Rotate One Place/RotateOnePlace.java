
public class RotateOnePlace {

    public static void rotate(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr);
        printArray(arr);
    }
}
