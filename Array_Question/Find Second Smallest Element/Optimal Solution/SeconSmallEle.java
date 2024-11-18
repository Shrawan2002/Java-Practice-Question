

public class SeconSmallEle {

    public static int secondSmall(int arr[]){
        int small = arr[0];
        int secSmall = Integer.MAX_VALUE;

        for(int i = 1; i<arr.length; i++){
            if (arr[i] <small) {
                secSmall = small;
                small = arr[i];
            }
            else if (arr[i] < secSmall && arr[i] != small) {
                secSmall = arr[i];
            }
        }
        return secSmall;
    }
    public static void main(String[] args) {
        int arr[] = {8, 4, 1, 3, 6};
        System.out.println(secondSmall(arr));
    }
}
