
public class SortedArray {

    public static boolean checkSortedArray(int arr[]){
        for(int i = 1; i<arr.length; i++){
            if (arr[i] >= arr[i-1]) {
                
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //non decending order means => acending order + equall to
        int arr[] = {1, 2, 3, 3, 4, 4};
        System.out.println(checkSortedArray(arr));
    }
}
