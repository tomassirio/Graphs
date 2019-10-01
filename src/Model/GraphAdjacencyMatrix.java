package Model;

import java.util.LinkedList;

public class GraphAdjacencyMatrix extends Graph {
    private Integer[][] matrix;

    public GraphAdjacencyMatrix(int v){
        V = v;
        matrix = new Integer[v][v];
        for (int i = 0; i < v; i++){
            for (int j = 0; j < v; j++){
                matrix[i][j] = Integer.MAX_VALUE; //There are no edges yet
            }
        }
    }

    public Integer[][] getMatrix() {
        return matrix;
    }

    public void addEdge(int v, int w){
        matrix[v][w] = w;
        matrix[w][v] = v;
    }
}
