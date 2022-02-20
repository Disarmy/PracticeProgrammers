import java.util.Arrays;

public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]));

        int count = 0;
        int now = 0;

        for (int[] interval : intervals) {
            if (now < interval[1]) {
                now = interval[1];
                count++;
            }
        }

        return count;
    }
}
