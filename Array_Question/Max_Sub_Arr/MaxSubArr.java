

public class MaxSubArr {

    public static void printMaxSubArr(int arr[]){
        int sum = 0;
        int maxSum = -1;
        for(int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
                int end = j;
                sum = 0;
                for(int k = start; k<=end; k++){
                    sum = sum + arr[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, -6, -8, 10, 12};
        printMaxSubArr(arr);
    }
}
