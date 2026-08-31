class MyStack {
    private final Queue<Integer> firstQueue;
    private final Queue<Integer> secondQueue;

    public MyStack() {
        this.firstQueue = new LinkedList<>();
        this.secondQueue = new LinkedList<>();
    }
    
    public void push(int x) {
        this.firstQueue.add(x);
    }
    
    public int pop() {
        int res = -1;
        while (this.firstQueue.size() != 1) {
            int in = this.firstQueue.poll();
            this.secondQueue.add(in);
        }

        if (this.firstQueue.size() == 1) {
            res = this.firstQueue.poll();
        }

        while(!this.secondQueue.isEmpty()) {
            int in = this.secondQueue.poll();
            this.firstQueue.add(in);
        }

        return res;
    }
    
    public int top() {
        int res = -1;
        while (this.firstQueue.size() != 1) {
            int in = this.firstQueue.poll();
            this.secondQueue.add(in);
        }

        if (this.firstQueue.size() == 1) {
            res = this.firstQueue.poll();
        }

        while(!this.secondQueue.isEmpty()) {
            int in = this.secondQueue.poll();
            this.firstQueue.add(in);
        }

        this.firstQueue.add(res);        

        return res;
    }
    
    public boolean empty() {
        return this.firstQueue.isEmpty();
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