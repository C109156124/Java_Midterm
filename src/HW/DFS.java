/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

/**
 *
 * @author Wei
 */
import java.util.LinkedList;

public class DFS {
    private int numVertices;
    private LinkedList<Integer>[] adjacencyList;

    public DFS(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertex, int edge) {
        adjacencyList[vertex].add(edge);
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        dfsUtil(startVertex, visited);
    }

    private void dfsUtil(int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");

        for (int i : adjacencyList[currentVertex]) {
            if (!visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(4);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 3);

        System.out.println("DFS starting from vertex 2:");
        dfs.dfs(2);
    }
}


