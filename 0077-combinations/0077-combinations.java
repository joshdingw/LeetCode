class Solution {
    List<List<Integer>> result;
    List<Integer> temp;
    public List<List<Integer>> combine(int n, int k) {
        result = new LinkedList<>();
        temp = new LinkedList<>();
        backTracking(n, k, 1);
        return result;
    }
    public void backTracking(int n, int k, int low){
        if(k == 0){
            result.add(new LinkedList(temp));
            return;
        }
        for(int i = low; i <= n; i++){
            temp.add(i);
            backTracking(n, k - 1, i + 1);

            temp.remove(temp.size() - 1);
        }
        
    }
}