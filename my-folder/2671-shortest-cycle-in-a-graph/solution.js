/**
 * @param {number} n
 * @param {number[][]} edges
 * @return {number}
 */
var findShortestCycle = function (n, edges) {
    let graph = new Graph(n);
    edges.forEach(edge => {
        graph.addEdge(edge[0], edge[1]);
    });

    return graph.shortestCycle();
};



class Graph {
    constructor(n) {
        this.adjList = new Array(n);
        for (let i = 0; i < n; i++) {
            this.adjList[i] = [];
        }
        this.n = n;
    }

    addEdge(u, v) {
        this.adjList[u].push(v);
        this.adjList[v].push(u); // Since the graph is bi-directional
    }

    shortestCycle() {
        let shortest = this.n + 1;

        for (let i = 0; i < this.n; i++) {
            let visited = new Array(this.n).fill(-1);
            let queue = [];
            visited[i] = 0;
            queue.push(i);

            while (queue.length > 0) {
                let node = queue.shift();
                for (let neighbor of this.adjList[node]) {
                    if (visited[neighbor] === -1) {
                        visited[neighbor] = visited[node] + 1;
                        queue.push(neighbor);
                    } else if (visited[neighbor] >= visited[node]) {
                        shortest = Math.min(shortest, visited[node] + visited[neighbor] + 1);
                    }
                }
            }
        }

        return shortest === this.n + 1 ? -1 : shortest;
    }
}



// Example usage:
console.log(findShortestCycle(7, [[0, 1], [1, 2], [2, 0], [3, 4], [4, 5], [5, 6], [6, 3]])); // Expected output: 3
console.log(findShortestCycle(4, [[0, 1], [0, 2]])); // Expected output: -1

