
public class SmallestElement {

    public static int smallestElement(int arr[]){
        int smallEle = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] < smallEle) {
                smallEle = arr[i];
            }
        }
        return smallEle;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 7};
        System.out.println( smallestElement(arr));  
  }
}
