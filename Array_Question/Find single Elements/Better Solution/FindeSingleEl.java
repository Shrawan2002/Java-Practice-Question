import java.util.*;
public class FindeSingleEl {
    public static int findeSingleElement(int nums[]){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int key: map.keySet()){
            if (map.get(key)==1) {
               return key; 
            }
        }
        return -1;   
     }
    public static void main(String[] args) {
        int nums[] = {4, 4, 3, 2, 1, 3,2, 1};
        System.out.println(findeSingleElement(nums));
    }
}
