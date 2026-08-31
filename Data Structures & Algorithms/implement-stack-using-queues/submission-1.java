class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        this.queue.add(x);
        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            int in = this.queue.poll();
            this.queue.add(in);
        }
    }
    
    public int pop() {
        return this.queue.poll();
    }
    
    public int top() {
        return this.queue.peek();
    }
    
    public boolean empty() {
        return this.queue.isEmpty();
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