class Solution {
    public int[][] generateMatrix(int n) {
        int count = 1;
        int row = 0, col = 0;
        int[][] temp = new int[n][n];
        int record = n;
        int index = 0;
        int size = n -1;
        while( size > 0){
            for(; col < size; col++){
                temp[row][col] = count++;
            }

            for(;row < size; row++){
                temp[row][col]= count++;
            }


            for(;col > index; col--){
                temp[row][col] = count++;
            }

            for(;row > index; row--){
                temp[row][col]= count++;
            }
            index++;
            row = index;
            col = index;
            size = size - 1;
        }
        
        if(record % 2 == 0){
            return temp;
        }
        temp[record/2][record/2] = count;

    
        return temp;
        
    }
}