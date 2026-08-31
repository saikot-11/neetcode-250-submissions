class KthLargest {
    private Queue<Integer> pq;
    private List<Integer> lists;
    private int kthLargest;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(Collections.reverseOrder());
        lists = new ArrayList<>();
        this.kthLargest = k;
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        int size = pq.size();
        int k = kthLargest;
        int res = -1;

        while (k >= 1) {
            res = pq.poll();
            k--;
            lists.add(res);
        }

        for (int i = 0; i < lists.size(); i++) {
            pq.offer(lists.get(i));
        }

        lists.clear();

        return res;
    }
}
