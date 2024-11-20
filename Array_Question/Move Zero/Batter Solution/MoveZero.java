
public class MoveZero {
    public static void moveZero(int arr[]){
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        for(int i = j ; i<arr.length; i++){
            arr[i] = 0;
        }
    }
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 2, 3, 0};
        moveZero(arr);
        printArray(arr);
    }
}
