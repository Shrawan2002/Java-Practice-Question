
public class MoveZero {

    public static void moveZero(int arr[] ){
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
   
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 0, 4, 5, 6, 0};
        moveZero(arr);
       printArray(arr);
    }
}
