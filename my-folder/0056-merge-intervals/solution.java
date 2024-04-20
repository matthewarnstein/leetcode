class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<int[]>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] prev = intervals[0];
        int start = prev[0];
        int end = prev[1];
        merged.add(prev);
        for (int i = 1; i < intervals.length; i++) {
            prev = merged.get(merged.size() - 1);
            if (intervals[i][0] <= prev[0] && intervals[i][1] <= prev[1] && intervals[i][1] >= prev[0]) {
                start = Math.min(prev[0], intervals[i][0]);
                end = Math.max(prev[1], intervals[i][1]);
                prev[0] = start;
                prev[1] = end;
            } else if ((intervals[i][0] <= prev[1] && intervals[i][0] >= prev[0]) ||
               (prev[0] >=  intervals[i][0] && prev[1] <= intervals[i][1]) ||
               (prev[0] == intervals[i][1]) ) {
                start = Math.min(prev[0], intervals[i][0]);
                end = Math.max(prev[1], intervals[i][1]);
                prev[0] = start;
                prev[1] = end;
            } else {
                merged.add(intervals[i]);
            }
        }
        int[][] res = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            res[i] = merged.get(i);
        }
        return res;
    }
}
