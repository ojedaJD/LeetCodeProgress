import java.util.List;

public class Intervals {


    public class Interval {
        public int start, end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }


    // You are given an array of non-overlapping intervals [intervals] where
    // intervals[i] = [start_i, end_i] represents the start and the end time of the ith interval.
    // intervals is initially sorted in ascending order by start_i.

    // You are given another interval newInterval = [start, end].

    // Insert newInterval into intervals such that intervals is still sorted in ascending order b
    // y start_i and also intervals still does not have any overlapping intervals.
    // You may merge the overlapping intervals if needed.

    // Return intervals after adding newInterval.

    // Note: Intervals are non-overlapping if they have no common point. For example, [1,2] and [3,4] are non-overlapping, but [1,2] and [2,3] are overlapping.

    public int[][] insert(int[][] intervals, int[] newInterval) {

        return intervals;
    }


    // Given an array of intervals where intervals[i] = [start_i, end_i], merge all overlapping intervals,
    // and return an array of the non-overlapping intervals that cover all the intervals in the input.

    // You may return the answer in any order.

    // Note: Intervals are non-overlapping if they have no common point.
    // For example, [1, 2] and [3, 4] are non-overlapping, but [1, 2] and [2, 3] are overlapping.


    public int[][] merge(int[][] intervals) {

        return intervals;
    }


    // Given an array of intervals intervals where intervals[i] = [start_i, end_i],
    // return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

    // Note: Intervals are non-overlapping even if they have a common point.
    // For example, [1, 3] and [2, 4] are overlapping, but [1, 2] and [2, 3] are non-overlapping.

    public int eraseOverlapIntervals(int[][] intervals) {

        return 0;
    }


    // Given an array of meeting time interval objects consisting of start and
    // end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i)
    // determine if a person could add all meetings to their schedule without any conflicts.


    public boolean canAttendMeetings(List<Interval> intervals) {


        return false;
    }

    // Given an array of meeting time interval objects consisting of start and
    // end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i),
    // find the minimum number of days required to schedule all meetings without any conflicts.

    public int minMeetingRooms(List<Interval> intervals) {

        return 0;
    }


}
