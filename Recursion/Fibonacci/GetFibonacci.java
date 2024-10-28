
public class GetFibonacci {

    public static int getFibonacciNum(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fnm1 = getFibonacciNum(n-1);
        int fnm2 = getFibonacciNum(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n = 25; // 5th  fibonacci number
        // f5 = f4 + f3 
        System.out.println(getFibonacciNum(n));
    }
}
