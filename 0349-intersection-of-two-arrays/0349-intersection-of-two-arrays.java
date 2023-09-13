import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0){
            return new int[0];
        }

        Set<Integer> record = new HashSet<>();
        Set<Integer> temp = new HashSet<>();

        for(int itr : nums1){
            record.add(itr);
        }

        for(int itr : nums2){
            if(record.contains(itr)){
                temp.add(itr);
            }
        }

        int[] result = new int[temp.size()];
        int j = 0;
        for(int itr : temp){
            result[j++] = itr;
        }

        return result;

    }
}