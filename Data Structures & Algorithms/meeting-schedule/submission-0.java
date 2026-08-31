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

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        for (int i = 1; i < intervals.size(); i++) {
            if (isIntervalConflicts(intervals.get(i - 1), intervals.get(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean isIntervalConflicts(Interval a, Interval b) {
        return a.end > b.start;
    }
}

class IntervalComparator implements Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
        if (a.start == b.start) {
            return Integer.compare(a.end, b.end);
        }
        return Integer.compare(a.start, b.start);
    }
}
