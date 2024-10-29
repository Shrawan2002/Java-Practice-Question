

// public class GetLastOccurence {

//     public static int lastOccurence(int arr[], int key, int i){
//         if (i == arr.length-1) {
//             return -1;
//         }
//         int isFound = lastOccurence(arr, key, i+1);
//         if (isFound == -1 && arr[i] == key) {
//             return i;
//         }
//         return isFound;
//     }
//     public static void main(String[] args) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         System.out.println(lastOccurence(arr, 3, 0));
//     }
// }


public class GetLastOccurence {

    public static int lastOccurence(int arr[], int key, int i) {
        // Base case: if index exceeds array length, return -1
        if (i == arr.length) {
            return -1;
        }
        // Recursive call to search in the remaining part of the array
        int isFound = lastOccurence(arr, key, i + 1);
        // If key is not found in the remaining part, check current position
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurence(arr, 3, 0));  // Output should be 8
    }
}
