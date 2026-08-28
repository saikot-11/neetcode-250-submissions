class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }

        while (pq.size() > 1) {
            int weight_1 = pq.poll();
            int weight_2 = pq.poll();

            if (weight_1 == weight_2) {
                continue;
            } else if (weight_1 < weight_2) {
                pq.add(weight_2 - weight_1);
            } else {
                pq.add(weight_1 - weight_2);
            }
        }

        return pq.size() == 1 ? pq.peek() : 0;
    }
}
