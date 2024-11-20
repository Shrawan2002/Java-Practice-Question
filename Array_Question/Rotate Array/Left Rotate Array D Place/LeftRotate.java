
public class LeftRotate {

    public static void rotate(int arr[], int k){
        int n = arr.length;
        k = k % n;
        int temp[] = new int[k];
        for(int i = 0; i<temp.length; i++){
            temp[i] = arr[i];
        }

        for(int i = k; i<arr.length; i++){
            arr[i-k] = arr[i];
        }
        // int j = 0;
        for(int i = n-k; i<arr.length; i++){
            arr[i] = temp[i - (n-k)];
            // j++;
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
   public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int d = 3;
    rotate(arr, d);
    printArray(arr);
   }
}
