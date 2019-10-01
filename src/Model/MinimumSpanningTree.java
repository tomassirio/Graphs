package Model;

public class MinimumSpanningTree {
    public static int minKey(GraphAdjacencyMatrix graph, int key[], Boolean mstSet[]) {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < graph.getV(); v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed MST stored in
    // parent[]
    public static void printMST(GraphAdjacencyMatrix graph, int parent[]) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < graph.getV(); i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph.getMatrix()[i][parent[i]]);
    }
}