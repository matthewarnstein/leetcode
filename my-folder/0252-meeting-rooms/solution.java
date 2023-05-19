class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        boolean[] cal = new boolean[1000000];

        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j < intervals[i][1]; j++) {
                if (!cal[j])
                    cal[j] = true;
                else
                    return false;
            }
        }

        return true;
    }
}
