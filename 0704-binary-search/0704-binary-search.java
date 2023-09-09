class Solution {
    public int search(int[] nums, int target) {
       int length = nums.length;
       if(length == 0){
           return -1;
       }
       return sort(nums, 0, length - 1, target);
        
    }
    
    public int sort(int[] array, int left, int right, int target){
        int mid = (right + left) / 2;
        int length = right - left + 1;
        if(length <= 0){
            return -1;
        }
        if(array[mid] == target){
            return mid;
        }
        if(array[mid] > target){
            return sort(array, 0, mid - 1, target);
        }else{
            return sort(array, mid + 1, right, target);
        }
    }
}