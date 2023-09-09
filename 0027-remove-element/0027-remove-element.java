class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                count++;
                continue;
            }
            nums[index] = nums[i];
            index++;
        }
        return nums.length - count;
    }
}