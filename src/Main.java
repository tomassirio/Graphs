import Model.*;
import Methods.*;

public class Main{
    public static void main(String args[]){
        GraphAdjacencyList graphAdjacencyList = new GraphAdjacencyList(4);
        GraphAdjacencyMatrix graphAdjacencyMatrix = new GraphAdjacencyMatrix(4);

        graphAdjacencyList.addEdge(0, 1);
        graphAdjacencyList.addEdge(0, 2);
        graphAdjacencyList.addEdge(1, 2);
        graphAdjacencyList.addEdge(2, 0);
        graphAdjacencyList.addEdge(2, 3);
        graphAdjacencyList.addEdge(3, 3);

        graphAdjacencyMatrix.addEdge(0, 1);
        graphAdjacencyMatrix.addEdge(0, 2);
        graphAdjacencyMatrix.addEdge(1, 2);
        graphAdjacencyMatrix.addEdge(2, 0);
        graphAdjacencyMatrix.addEdge(2, 3);
        graphAdjacencyMatrix.addEdge(3, 3);

        System.out.println("BFS starting from vertex 2");

        BreadthFirstSearch.BFS(graphAdjacencyList, 2);

        System.out.println("DFS starting from vertex 2");

        DepthFirstSearch.DFS(graphAdjacencyList,2);

        System.out.println("Prim");

        Prim.primMST(graphAdjacencyMatrix);
    }
}