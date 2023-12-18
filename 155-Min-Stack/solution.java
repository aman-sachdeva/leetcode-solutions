class MinStack {
    Stack<Integer> x = new Stack<>();
    Stack<Integer> min= new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
       x.push(val); 
       if(min.isEmpty() || x.peek() <= min.peek())
            min.push(val);
        
    }
    
    public void pop() {
        if(x.peek().equals(min.peek()))
        {
            min.pop();
        }
        x.pop();
    }
    
    public int top() {
    return x.peek();
    }
    
    public int getMin() {
       return min.peek(); 
    }
}