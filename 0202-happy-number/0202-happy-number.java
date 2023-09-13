import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        int length = String.valueOf(n).length();
        int[] nums = nToArray(n);
        
        Set<Integer> record = new HashSet<>();
        int sum = squareSum(nums);
        record.add(sum);
        while(sum != 1){
            nums = nToArray(sum);
            sum = squareSum(nums);
            if(record.contains(sum)){
                return false;
            }else{
                record.add(sum);
            }
        }

        return true;

        
    }
    public int[] nToArray(int n){
        int length = String.valueOf(n).length();
        char[] numsChar= (Integer.toString(n)).toCharArray();
        int[] nums =  new int[length];
        for(int i = 0 ; i < length; i++){
            nums[i] = Character.getNumericValue(numsChar[i]);
        }
        return nums;
    }
    public int squareSum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i] * nums[i];
        }
        return sum;
    }
}