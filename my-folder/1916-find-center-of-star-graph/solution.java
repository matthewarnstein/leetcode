class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] freq = new int[n + 1];
        int max = -1;
        int node_max = -1;

        for (int[] edge : edges) {
            freq[edge[0]] += 1;
            if (freq[edge[0]] > freq[0]) {
                freq[0] = freq[edge[0]];
                node_max = edge[0];
            }
            freq[edge[1]] += 1;
            if (freq[edge[1]] > freq[0]) {
                freq[0] = freq[edge[1]];
                node_max = edge[1];
            }
        }
        
        return node_max;

    }
}
