class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }

        // Create an adjacency list to represent the graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }

        // Perform BFS to find if a path exists
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int current = queue.remove();
            List<Integer> neighbors = graph.get(current);
            if (neighbors != null) {
                for (int neighbor : neighbors) {
                    if (neighbor == destination) {
                        return true;
                    }
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }

        return false;
    }
}
