

public class PrintDecreasingOrder {

    public static void printNum(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printNum(n);
    }
}

