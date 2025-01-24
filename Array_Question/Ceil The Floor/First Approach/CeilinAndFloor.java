import java.util.*;

public class CeilinAndFloor {

    public static int[] findFloorAndCeiling(int nums[], int x){
        int floor = floor(nums, x);
        int ceiling = ceiling(nums, x);
        return new int[]{floor, ceiling};
    }
    public static int floor(int nums[], int x){
        int n = nums.length;
        int ans = -1;
        for(int i = 0; i<n; i++){
            if (nums[i] <= x && nums[i] > ans) {
                ans = nums[i];
            }
        }
        return ans;
    }

    public static int ceiling(int nums[], int x){
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if (nums[i] >= x && nums[i] < ans) {
                ans = nums[i];
            }
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
    public static void main(String[] args) {
        int nums[] = {5, 6, 8, 9, 6, 5, 5, 6};
        int ans[] = findFloorAndCeiling(nums,7);
        System.out.println("floor" + " " + ans[0]);
        System.out.println("ceiling" + " " +  ans[1]);
    }
}
