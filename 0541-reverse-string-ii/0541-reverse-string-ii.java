class Solution {
    public String reverseStr(String s, int k) {
        int start = 0;
        int length = s.length();
        StringBuffer res = new StringBuffer();
        while(start < length){
            StringBuffer temp = new StringBuffer();
            int firstK = start + k > length ? length : start +  k;
            int secondK = start + 2 * k > length ? length : start + 2 * k;

            temp.append(s.substring(start,firstK));
            res.append(temp.reverse());

            if(secondK > firstK){
                res.append(s.substring(firstK,secondK));
            }
            start = secondK;

        }
        return res.toString();
        
    }

}