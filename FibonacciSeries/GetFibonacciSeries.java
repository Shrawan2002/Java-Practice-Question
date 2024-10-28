

import java.util.Scanner;

public class GetFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term");
        int n = sc.nextInt();
        int x =0; int y = 1; int z = 0; int term = 1;
        while (term <= n) {
            System.out.println(z);
            x = y;
            y = z;
            z = x+y;
            term++;
        }
    }
}
