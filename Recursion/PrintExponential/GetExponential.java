

public class GetExponential {

    public static int getPow(int x , int n){
        if (n == 0) {
            return 1;
        }
        // int xnm1 = getPow(x, n-1);
        // int xn = x*xnm1;
        // return xn;

        return x*getPow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(getPow(2, 3  ));
    }
}
