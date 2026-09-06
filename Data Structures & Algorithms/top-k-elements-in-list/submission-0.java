class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Freq> pq = new PriorityQueue<>(new FreqComparator());
        Map<Integer, Integer> map = new HashMap<>();
        int [] res = new int [k];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer in : map.keySet()) {
            pq.add(new Freq(in, map.get(in)));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int i = 0;
        while (!pq.isEmpty()) {
            res[i] = pq.poll().num;
            i++;
        }

        return res;
    }

    class Freq {
        int num;
        int freq;

        public Freq (int num, int freq) {
            this.num = num;
            this.freq = freq;
        }
    }

    class FreqComparator implements Comparator<Freq> {
        @Override
        public int compare (Freq a, Freq b) {
            return Integer.compare(a.freq, b.freq);
        }
    }
}
