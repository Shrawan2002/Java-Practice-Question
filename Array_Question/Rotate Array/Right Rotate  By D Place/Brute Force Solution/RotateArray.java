
public class RotateArray {

    public static void rightRotate(int arr[] , int k){
        int n = arr.length;
        k = k % n;

        int temp[] = new int[n-k];
        for(int i= 0; i<n-k; i++){
            temp[i] = arr[i];
        }

        for(int i = n-k; i<n; i++){
            arr[i - (n-k)] = arr[i];
        }
        // int j =0;

        for(int i = k; i<n; i++){
            arr[i] = temp[i - k];
            // j++;
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 4;
        rightRotate(arr, k);
        printArray(arr);
    }
}
