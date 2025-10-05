package problemsolving.arrayproblems.twodarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();

        for (int[] interval : intervals) {
            if (res.isEmpty() || interval[0] > res.getLast()[1])
                res.add(interval);
            else
                res.getLast()[1] = Math.max(res.getLast()[1], interval[1]);
        }

        return res.toArray(new int[res.size() - 1][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,6},{8,10},{15,18}}; // [[1,6],[8,10],[15,18]]
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
