
public class SecondSmallestEle {

    public static int secondSmallElement(int arr[]){
        int small = arr[0];
        int seSmall = Integer.MAX_VALUE;

        for(int i =1; i<arr.length; i++){
            if (arr[i] <small) {
                small = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            if (arr[i] <seSmall && arr[i] != small) {
                seSmall = arr[i];
            }
        }
        return seSmall;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 5, 6};
        System.out.println(secondSmallElement(arr));
    }
}
