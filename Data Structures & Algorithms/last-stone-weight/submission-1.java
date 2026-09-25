/**
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }

        while (pq.size() > 1) {
            int stone1 = pq.poll();
            int stone2 = pq.poll();

            if (stone1 == stone2) {
                continue;
            }

            pq.offer(Math.max(stone1, stone2) - Math.min(stone1, stone2));
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}
