

public class Prefix_Sum {

    public static void maxSum(int arr[]){

        int curSum = 0;
        int maxSum = -1;
        int n = arr.length;

        int prefixSumArr [] = new int[n];
        prefixSumArr[0] = arr[0];

        for(int i =1; i<prefixSumArr.length; i++){
            prefixSumArr[i] = prefixSumArr[i-1] + arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
                int end = j;
                curSum = start == 0? prefixSumArr[end] : prefixSumArr[end] - prefixSumArr[start - 1];
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
