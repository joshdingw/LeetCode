import java.util.Set;
import java.util.HashSet;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int temp;
        for(int i = 0; i < nums.length; i++){
            temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[] {i,map.get(temp)};
            }else{
                map.put(nums[i], i);
            }
        }
        
        return new int[] {0,0};
    }
}