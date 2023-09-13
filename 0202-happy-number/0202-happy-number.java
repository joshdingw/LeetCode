import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> record = new HashSet<>();

        int sum = changeN(n);

        while(sum != 1){
            if(record.contains(sum)){
                return false;
            }
            record.add(sum);
            sum = changeN(sum);
        }
        return true;
    }

    public int changeN(int n){
        int result = 0;
        while(n != 0){
            result += (n % 10) * (n % 10);
            n = n / 10;
        }
        return result;
    }
}