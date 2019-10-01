package Methods;

import Model.GraphAdjacencyMatrix;
import Model.MinimumSpanningTree;

public abstract class Prim {

    public static Boolean[] primMST(GraphAdjacencyMatrix graph) {
        int parent[] = new int[graph.getV()];
        int key[] = new int[graph.getV()];
        Boolean mstSet[] = new Boolean[graph.getV()];

        for (int i = 0; i < graph.getV(); i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0; // Make key 0 so that this vertex is
        parent[0] = -1; // First node is always root of MST

        // The MST will have V vertices
        for (int count = 0; count < graph.getV() - 1; count++) {
            int u = MinimumSpanningTree.minKey(graph, key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < graph.getV(); v++)
                if (graph.getMatrix()[u][v] != 0 && mstSet[v] == false && graph.getMatrix()[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph.getMatrix()[u][v];
                }
        }

        // print the constructed MST
        MinimumSpanningTree.printMST(graph, parent);
        return mstSet;
    }
}
