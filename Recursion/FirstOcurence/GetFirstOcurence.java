

// public class GetFirstOcurence {
//     public static int firstOcurence(int arr[], int key, int i){
//         if (i == arr.length) {
//             return -1;
//         }
//         if (arr[i] ==key) {
//             return i;
//         }
//         // int idx =  firstOcurence(arr, key, i+1);

//         return  firstOcurence(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 11};
//         System.out.println(firstOcurence(arr, 11, 0));
//     }
// }

public class GetFirstOcurence {
    public static int firstOcurence(int arr[],int key, int idx){
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        }
        return firstOcurence(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 11};
        System.out.println(firstOcurence(arr, 5, 0));
    }
}