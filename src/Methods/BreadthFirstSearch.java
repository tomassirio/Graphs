package Methods;

import Model.Graph;
import Model.GraphAdjacencyList;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class BreadthFirstSearch {
    public static boolean[] BFS(GraphAdjacencyList graph, int source){
        boolean visited[] = new boolean[graph.getV()];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[source] = true;
        queue.add(source);

        while (queue.size() != 0)
        {
            source = queue.poll();
            System.out.println(source + " ");

            Iterator<Integer> i = graph.getNeighbors()[source].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return visited;
    }
}
