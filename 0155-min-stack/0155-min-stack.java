class MinStack {

    Stack<Integer> main = new Stack<>();
    Stack<Integer> min = new Stack<>();
    
    public void push(int value) {

        main.push(value);

        if(min.isEmpty())
        {
            min.push(value);
        }
        else if(value < min.peek())
        {
            min.push(value);
        }
        else
        {
            min.push(min.peek());
        }
        
    }
    
    public void pop() {
        main.pop();
        min.pop();
        
    }
    
    public int top() {
        return main.peek();
        
    }
    
    public int getMin() {
        return min.peek();
    }
}

