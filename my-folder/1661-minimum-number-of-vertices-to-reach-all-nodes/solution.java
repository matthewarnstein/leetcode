class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inbound = new int[n];
        List<Integer> list = new ArrayList<Integer>();
        for (List<Integer> edge : edges) {
            inbound[edge.get(1)] += 1;
        }
        for (int i = 0; i < n; i++) {
            if (inbound[i] == 0)
                list.add(i);
        }

        return list;
    }
}
