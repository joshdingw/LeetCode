class Solution {
    public boolean isValid(String s) {
        Stack<Character> record = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                record.push('(');
            }
            if(s.charAt(i) == '{'){
                record.push('{');
            }
            if(s.charAt(i) == '['){
                record.push('[');
            }
            if(s.charAt(i) == '}'){
                if(!record.empty() && record.pop() == '{' ){
                    continue;
                }
                return false;
            }
            if(s.charAt(i) == ']'){
                if(!record.empty() && record.pop() == '[' ){
                    continue;
                }
                return false;
            }
            if(s.charAt(i) == ')'){
                if(!record.empty() && record.pop() == '(' ){
                    continue;
                }
                return false;
            }
        }
        if(record.empty()){
            return true;
        }
        return false;
        
        
    }
}