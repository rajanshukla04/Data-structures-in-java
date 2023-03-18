import java.util.*;

public class BellmanFordAlgo {
    static class Edge {
        int src;
        int dec;
        int wt;

        Edge(int s, int d, int wt) {
            this.src = s;
            this.dec = d;
            this.wt = wt;
        }
    }

    public static void create(ArrayList<Edge> graph[]) {
        // create the empty list in the array
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void BellmanFord(ArrayList<Edge> graph[], int src, int v) {
        int dis[] = new int[v];
        for (int i = 0; i < v; i++) {
            if (i != src) {
                dis[i] = Integer.MAX_VALUE;

            }
        }
        for (int k = 0; k < v - 1; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    int u = e.src;
                    int V = e.dec;
                    if (dis[u] != Integer.MAX_VALUE && dis[u] + e.wt < dis[V]) {
                        dis[V] = dis[u] + e.wt;
                    }

                }

            }

        }
        for (int i = 0; i < dis.length; i++) {
            System.out.print(dis[i] + " ");
        }

    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        create(graph);
        BellmanFord(graph, 0, v);

    }

}
