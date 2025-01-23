import java.util.*;
public class FindSingleEle {

    public static int findSingleElement(int nums[]){
        int n = nums.length;
        for(int i =0; i<n; i++){
            int flag = 0;
            for(int j =0; j<n; j++){
                if(nums[j] == nums[i]){
                    flag++;
                }
            }
            if (flag == 1) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4, 4, 3, 2, 1, 2, 1};
        System.out.println(findSingleElement(nums));
    }
}
