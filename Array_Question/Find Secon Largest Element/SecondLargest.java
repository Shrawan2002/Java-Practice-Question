
public class SecondLargest {
    public static int secondLargest(int arr[]){
        int largest = 1;
        int slargest = -1;

        for(int i = 0; i<arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for(int i =0; i<arr.length; i++){
            if (arr[i] > slargest && arr[i] < largest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 7, 5};
      System.out.println(secondLargest(arr));
    }
}
