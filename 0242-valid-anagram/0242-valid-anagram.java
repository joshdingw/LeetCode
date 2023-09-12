class Solution {
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];

        char[] sNew = s.toCharArray();
        char[] tNew = t.toCharArray();
        for(int i = 0; i < sNew.length; i++){
            record[sNew[i] - 'a']++;
        }

        for(int i = 0; i < tNew.length; i++){
            record[tNew[i] - 'a']--;
        }
        for(int i = 0; i < record.length; i++){
            if(record[i] != 0){
                return false;
            }
        }
        return true;

    }
}