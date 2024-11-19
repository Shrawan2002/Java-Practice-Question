
public class RotateArray {
     // Function to rotate an array by d elements in counter-clockwise direction.
    public static void rotateArray(int arr[] , int d){
        int n = arr.length;
        d = d%n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

    }
    public static void reverse(int arr[], int start, int end){
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArray(arr, d);
        printArray(arr);
    }
}
