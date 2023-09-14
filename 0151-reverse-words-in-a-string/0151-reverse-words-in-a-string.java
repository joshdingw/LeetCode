class Solution {
    public String reverseWords(String s) {
        // while(s.charAt(0) == ' '){
        //     s = s.substring(1);
        // }
        s = s.strip();
        String[] records = s.split(" ", 0);

        String result = "";
     
        for(int i = records.length - 1; i > 0; i--){
            if(records[i] == ""){
                continue;
            }
            result = result + records[i].strip() + " ";
        }
        result = result + records[0].strip();
        return result;
    }
}