/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Freq> freqMap = new HashMap<>();
        PriorityQueue<Freq> pq = new PriorityQueue<>(new FreqComparator());

        for (int i = 0; i < nums.length; i++) {
            if (freqMap.containsKey(nums[i])) {
                Freq temp = freqMap.get(nums[i]);
                temp.count += 1;
                freqMap.put(nums[i], temp);
            } else {
                Freq temp = new Freq(nums[i], 1);
                freqMap.put(nums[i], temp);
            }
        }

        for (Integer in : freqMap.keySet()) {
            Freq temp = freqMap.get(in);
            pq.add(temp);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int [] res = new int [pq.size()];
        int i = 0;

        while (!pq.isEmpty()) {
            res[i] = pq.poll().num;
            i++;
        }

        return res;
    }
}

class Freq {
    public int num;
    public int count;

    public Freq(int num, int count) {
        this.num = num;
        this.count = count;
    }
}

class FreqComparator implements Comparator<Freq> {
    @Override
    public int compare(Freq a, Freq b) {
        return Integer.compare(a.count, b.count);
    }
}
