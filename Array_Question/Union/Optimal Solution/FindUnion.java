import java.util.*;

public class FindUnion {

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int i =0;
        int j = 0;
        ArrayList<Integer> Union = new ArrayList<>();

        while (i<n && j<m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            }else{
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i<n) {
            if (Union.get(Union.size() -1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }

        while (j<m) {
            if (Union.get(Union.size() -1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }

        return Union;
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
