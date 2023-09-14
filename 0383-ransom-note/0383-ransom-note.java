class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] records = new int[26];
        char[] temp = magazine.toCharArray();
        for(int i = 0; i < temp.length; i++){
             records[temp[i] - 'a']++;
        }
        char[] target = ransomNote.toCharArray();
        for(int i = 0; i < target.length; i++){
             records[target[i] - 'a']--;
        }

        for(int i = 0; i < records.length; i++){
             if(records[i] < 0){
                 return false;
             }
        }
        return true;
        
    }
}