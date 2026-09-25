/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

/**
 * Time Complexity: O(n log n)
 * Space Complexity: O(1);
 */
class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        for (int i = 1; i < intervals.size(); i++) {
            Interval first = intervals.get(i - 1);
            Interval second = intervals.get(i);

            if (second.start < first.end) {
                return false;
            }
        }

        return true;
    }
}

class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
        if (a.start == b.end) {
            return Integer.compare(a.end, b.end);
        }
        return Integer.compare(a.start, b.start);
    }
}