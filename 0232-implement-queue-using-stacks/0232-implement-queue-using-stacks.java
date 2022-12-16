class MyQueue {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        change(in, out);
        int popNum = out.pop();
        change(out, in);
        
        return popNum;
    }
    
    private void change(Stack a, Stack b) {
        while (!a.isEmpty()) {
            b.push(a.pop());
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