import java.util.ArrayList;

public class cycleInUndirectedGraph {
    public static class Edge {
        int src;
        int dec;

        Edge(int src, int dec) {
            this.src = src;
            this.dec = dec;
        }

    }

    // create the grpah
    public static void create(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 0));
       graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[4].add(new Edge(4, 0));
       graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

    }

    public static boolean isCycleGraph(ArrayList<Edge> graph[], boolean vis[], int curr, int parent) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (vis[e.dec] && e.dec != parent) {
                return true;
            }
            if (!vis[e.dec]) {
                if (isCycleGraph(graph, vis, e.dec, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 6;
        
        // list of array
        ArrayList<Edge> graph[] = new ArrayList[v];
        create(graph);
        System.out.print(isCycleGraph(graph, new boolean[v], 0, -1));

    }

}
