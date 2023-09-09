class Solution {
   public int[] sortedSquares(int[] nums) {
       int left = 0;
       int right = nums.length - 1;
       int[] temp = new int[nums.length];
       int index = right;
       while(left <= right){
           int leftVal = nums[left] * nums[left];
           int rightVal = nums[right] * nums[right];
           if(leftVal > rightVal){
               temp[index] = leftVal;
               left++;
           }else{
               temp[index] = rightVal;
               right--;
           }
           index--;
       }
       return temp;
    }
}