class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //return canVisit(rooms, 0, rooms.size() - 1);
        for (int i = 1; i < rooms.size(); i++) {
            boolean can = canVisit(rooms, 0, i);
            if (!can) {
                System.out.println("failure at 0->"+i);
                return false;
            }
        }

        return true;
    }

    public boolean canVisit(List<List<Integer>> rooms, int start, int dest) {
        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> queue = new Stack<Integer>();
        List<Integer> path = new ArrayList<Integer>();
        queue.push(start);
        path.add(start);
        //visited[start] = true;
        boolean found = bfs(rooms, start, dest, path, visited, queue);
        //if (found) {
            System.out.println("["+dest+"] = "+Arrays.toString(path.toArray()));
        //}
        return found;

    }

    public boolean bfs(List<List<Integer>> rooms, int start, int dest, List<Integer> path, boolean[] visited, Stack<Integer> queue) {
        List<Integer> p = new ArrayList<Integer>(path);

        while (!queue.empty()) {
            int room = queue.pop();
            
            if (!visited[room]) {
                visited[room] = true;
                for (int key : rooms.get(room)) {
                    if (key != room) {
                        
                        p.add(key);
                        if (key == dest) {
                            return true;
                        } else {
                            queue.push(key);
                            
                        }
                    }
                }
                
            }
            return bfs(rooms, start, dest, p, visited, queue);
        }
        return false;
    }
}
