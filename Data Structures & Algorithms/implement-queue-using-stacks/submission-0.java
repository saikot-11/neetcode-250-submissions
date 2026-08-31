class MyQueue {
    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;

    public MyQueue() {
        this.firstStack = new Stack<>();
        this.secondStack = new Stack<>();
    }
    
    public void push(int x) {
        this.firstStack.push(x);
    }
    
    public int pop() {
        while (!this.firstStack.isEmpty()) {
            int in = this.firstStack.pop();
            this.secondStack.push(in);
        }

        int res = this.secondStack.pop();

        while(!this.secondStack.isEmpty()) {
            int in = this.secondStack.pop();
            this.firstStack.push(in);
        }

        return res;
    }
    
    public int peek() {
        while (!this.firstStack.isEmpty()) {
            int in = this.firstStack.pop();
            this.secondStack.push(in);
        }

        int res = this.secondStack.peek();

        while(!this.secondStack.isEmpty()) {
            int in = this.secondStack.pop();
            this.firstStack.push(in);
        }

        return res;
    }
    
    public boolean empty() {
        return this.firstStack.isEmpty();
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