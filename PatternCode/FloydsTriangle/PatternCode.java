
public class PatternCode {


    public static void floydPattern(int n){
        int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        floydPattern(5);
    }
}