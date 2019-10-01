package Model;

public abstract class Graph {
    protected int V;   // Number of Vertex
    protected int E;  // Number of Edges
    Edge edge[];

    public int getV() {
        return V;
    }

    public int getE() {
        return E;
    }
}
