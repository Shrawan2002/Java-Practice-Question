
public class ReverseArr {

    public static void reverse(int arr[]){
        int first = 0; 
        int end = arr.length-1;
        while (first <end) {
            int temp = arr[end];
            arr[end] = arr[first];
            arr[first] = temp;
            first++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        reverse(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
