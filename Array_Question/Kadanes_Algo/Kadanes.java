
public class Kadanes {

    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i<arr.length; i++){
            cs = cs + arr[i];

            ms = Math.max(cs, ms);


            if (cs < 0) {
                cs = 0;
            }

           
        }

        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr2[] = {-2, -3, -1, -4};
        kadanes(arr2);
    }
}
