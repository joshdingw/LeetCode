class MyStack {
    Queue<Integer> input;
    Queue<Integer> temp;

    public MyStack() {
        input = new ArrayDeque<>();
        temp = new ArrayDeque<>();
    }
    
    public void push(int x) {
        if(temp.isEmpty()){
            while(!input.isEmpty()){
                temp.add(input.poll());
            }
        }
        input.add(x);
        while(!temp.isEmpty()){
                input.add(temp.poll());
            }
    }
    
    public int pop() {
       
        return input.poll();
        
    }
    
    public int top() {
        return input.peek();
        
    }
    
    public boolean empty() {
        return input.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */