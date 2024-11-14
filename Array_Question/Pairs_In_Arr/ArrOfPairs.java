

public class ArrOfPairs {

    public static void printsPairs(int arr[]){
        int tp =0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.print("(" +arr[i]  + ","+  arr[j] + ")");
                tp++;
            }
            System.out.println(" ");
        }
        System.out.println("total pairs =" + tp);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 10, 8, 13};
        printsPairs(arr);
    }
}
