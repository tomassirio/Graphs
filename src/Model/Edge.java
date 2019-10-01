package Model;

public class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }

        public int compareTo(Edge compareEdge){
            return this.weight-compareEdge.weight;
        }

        public int getSrc() {
            return src;
        }

        public int getDest() {
            return dest;
        }

        public int getWeight() {
            return weight;
        }
}
