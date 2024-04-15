class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length < n - 1)
            return -1;

        int[] indegrees = new int[n];
        int[] outdegrees = new int[n];

        for (int[] edge : trust) {
            outdegrees[edge[0] - 1] += 1;
            indegrees[edge[1] - 1] += 1;
        }

        for (int i = 0; i < n; i++) {
            if (indegrees[i] == n - 1 && outdegrees[i] == 0)
                return i + 1;
        }

        return -1;
    }
}
