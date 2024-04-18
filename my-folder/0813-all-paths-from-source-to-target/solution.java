class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] visited = new boolean[graph.length];
        int source = 0;
        stack.push(source);
        path.add(source);
        bfs(graph, 0, graph.length - 1, path, stack, visited, paths);
        // return dfs(graph, 1, graph.length - 1);
        // return dfs(graph, graph.length - 2, graph.length - 1);
        return paths;
    }

    public void bfs(int[][] graph, int source, int destination, List<Integer> path, Stack<Integer> stack, boolean[] visited, List<List<Integer>> paths) {
        //List<List<Integer>> paths = new ArrayList<List<Integer>>();
        //List<Integer> path = new ArrayList<Integer>();
        



        while (!stack.empty()) {
            int vertex = stack.pop();
            if (!visited[vertex]) {
                //path.add(vertex);
                //bfs(graph, vertex, destination);
                for (int adjacent : graph[vertex]) {
                    List<Integer> p = new ArrayList<Integer>(path);
                    p.add(adjacent);
                    stack.push(adjacent);
                    if (adjacent == destination) {
                        paths.add(p);
                        //return path;
                    } else {
                        bfs(graph, adjacent, destination, p, stack, visited, paths);
                    }
                    
                }
                //visited[vertex] = true;
            }
        }
        return;
    }
}
