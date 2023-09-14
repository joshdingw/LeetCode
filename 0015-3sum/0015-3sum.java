import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                return result;
            }
            if( i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int temp = nums[i] + nums[left] + nums[right]; 
                if(temp > 0){
                    right--;
                }else if(temp < 0){
                    left++;
                }else{
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(right > left && nums[right] == nums[right - 1]){
                        right--;
                    }
                    while(right > left && nums[left] == nums[left + 1]){
                        left++;
                    }
                    left++;
                    right--;
                }
                
            }

        }
        return result;
    }
}