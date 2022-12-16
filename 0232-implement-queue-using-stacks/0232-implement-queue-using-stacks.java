class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    
    public MyQueue() {
        // 3 2 1
        // 1 2 3
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        change(in, out);
        int popNum = out.pop();
        change(out, in);
        
        return popNum;
    }
    
    private void change(Stack in, Stack out) {
        int size =  in.size();
        
        for (int i = 0; i < size; i++) {
            out.push(in.pop());
        }
    }
    
    public int peek() {
        return in.firstElement();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */