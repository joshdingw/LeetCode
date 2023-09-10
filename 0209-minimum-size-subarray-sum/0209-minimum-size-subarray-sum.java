class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int length = 0;
        int subLength = Integer.MAX_VALUE;
        int start = 0;
        for(int right = 0; right < nums.length; right++){
            sum = sum + nums[right];
            while(sum >= target){
                length = right - start + 1;
                sum = sum - nums[start];
                start++;
                if(subLength > length){
                    subLength = length;
                }
            }
        }
        return subLength == Integer.MAX_VALUE ? 0 : subLength;
    }
}