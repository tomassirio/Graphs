package Model;

import java.util.LinkedList;

public class GraphAdjacencyList extends Graph{
    private LinkedList<Integer> neighbors[]; //Adjacency Lists

    // Constructor
    public GraphAdjacencyList(int v){
        V = v;
        neighbors = new LinkedList[v];
        for (int i=0; i<v; ++i)
            neighbors[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w){
        neighbors[v].add(w);
        Edge edge = new Edge();
    }

    public LinkedList<Integer>[] getNeighbors() {
        return neighbors;
    }

}
