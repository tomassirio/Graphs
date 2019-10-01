package Methods;

import Model.GraphAdjacencyList;

import java.util.Iterator;

public abstract class DepthFirstSearch {
    public static void DFSRecursive(GraphAdjacencyList graph, int v, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.println(v + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = graph.getNeighbors()[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSRecursive(graph, n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    public static boolean[] DFS(GraphAdjacencyList graphAdjacencyList, int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[graphAdjacencyList.getV()];

        // Call the recursive helper function to print DFS traversal
        DFSRecursive(graphAdjacencyList, v, visited);
        return visited;
    }
}
