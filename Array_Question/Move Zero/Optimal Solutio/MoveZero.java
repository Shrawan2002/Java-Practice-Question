
public class MoveZero {

    public static void moveZero(int arr[] ){
        int i = 0;
        for(int j = 0; j<arr.length; j++){
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 0, 4, 5, 6, 0};
        moveZero(arr);
       printArray(arr);
    }
}
