
public class LargestElement {
    public static int largestElement(int arr[]){
        int largest = -1;
        for(int i =0; i<arr.length; i++){
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 6, 7, 2};
        System.out.println(largestElement(arr));
    }
}
