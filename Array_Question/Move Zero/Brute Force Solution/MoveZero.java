
public class MoveZero {
    public static void moveZero(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i<temp.length; i++){
            arr[i] = temp[i];
        }
        for(int i = temp.length; i<n; i++ ){
            arr[i] = 0;
        }
    }

    // public static void printArray(int arr[]){
    //     for(int i = 0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 4, 0, 7};
        moveZero(arr);
        printArray(arr);
    }
}

// time complexity = O(n) + O(x) + O(n-x) = O(2n)
// Space complexity = O(N)
