
public class SeconLargest {
    public static int secondLargest(int arr[]){
        int largest = 1;
        int sLargest = -1;

        for(int i = 0; i<arr.length; i++){
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            }else if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 7, 5};
        System.out.println(secondLargest(arr));
    }
}
