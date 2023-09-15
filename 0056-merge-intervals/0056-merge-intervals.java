import java.util.ArrayList;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        ArrayList<int[]> res = new ArrayList<>();
        if (intervals.length != 0) {
            res.add(intervals[0]);
        }
        int p1 = 0;
        int p2 = 1;
        while (p2 < intervals.length) {
            if (res.get(p1)[1] >= intervals[p2][0]) {
                if (res.get(p1)[1] < intervals[p2][1]) {
                    res.get(p1)[1] = intervals[p2][1];
                }
            } else {
                res.add(intervals[p2]);
                p1++;
            }
            p2++;
        }
        return res.toArray(new int[res.size()][]);
    }
}
