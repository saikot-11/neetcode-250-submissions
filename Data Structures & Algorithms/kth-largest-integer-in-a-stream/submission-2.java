/**
 * Time Complexity: O(n log k)
 * Space Complexity: O(k)
 */
class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue<Integer>();
        this.k = k;

        for (int i = 0; i < nums.length; i++) {
            this.pq.offer(nums[i]);
            if (pq.size() > this.k) {
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        this.pq.offer(val);
        if (pq.size() > this.k) {
            pq.poll();
        }
        return pq.peek();
    }
}
