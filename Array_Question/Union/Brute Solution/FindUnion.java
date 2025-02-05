import java.util.*;
public class FindUnion {

    public static ArrayList<Integer> findUnion(int arr1[] , int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>(); 

        for(int i = 0; i<n; i++){
            set.add(arr1[i]);
        }

        for(int i = 0; i<m; i++){
            set.add(arr2[i]);
        }
        for(int el : set){
            union.add(el);
        }
        return union;
    }
  public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = findUnion(arr1, arr2);
        for(int value : Union){
            System.out.print(value + " ");
          }
    }
}

// TC - o(nlogn + nlogm) + 0(n + m)
// sC - o(n+m) + o(n+m)