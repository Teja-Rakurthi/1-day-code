
import java.util.HashMap;
public class Lc1twosum {

    public static int[] Twosum(int[] nums,int target){
   HashMap <Integer,Integer> map=new HashMap<>();
   for(int i=0; i<nums.length;i++){
    int complement=target-nums[i];
    if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // store number and index
            map.put(nums[i], i);
        }

        return new int[]{};
   }

    public static void main (String [] args){
        int[] nums={1,2,3,4};
        int target=7;
        int[] result = Twosum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}
