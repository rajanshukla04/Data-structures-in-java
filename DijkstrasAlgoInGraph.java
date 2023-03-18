import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgoInGraph{
    static class Edge{
        int src;
        int dec;
        int wt;
        Edge(int s,int d,int wt){
            this.src=s;
            this.dec=d;
            this.wt=wt;
        }
    }
public static void create(ArrayList<Edge> graph[]){
    // create the empty list in the array
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0, 1, 2));
    graph[0].add(new Edge(0,2,4));

    graph[1].add(new Edge(1, 3,7));
    graph[1].add(new Edge(1, 2,1));

    graph[2].add(new Edge(2,4,3));
    graph[3].add(new Edge(3,5,1));

    graph[4].add(new Edge(4,3,2));
    graph[4].add(new Edge(4,5,5));


}
public static class pair implements Comparable<pair>{
    int node;
    int dist;
    pair(int n,int d){
        this.node=n;
        this.dist=d;

    }
    @Override
    public int compareTo(pair p2){
        return this.dist-p2.dist;
    }
}


public static void dijkstra(ArrayList<Edge> graph[],int src,int v){
    PriorityQueue<pair> pq=new PriorityQueue<>();
    int dis[]=new int[v];
   
    for(int i=0;i<v;i++){
        if(i!=src){
            dis[i]=Integer.MAX_VALUE;
        }
    }
    boolean vis[]=new boolean[v];
   // self node has always the 0 weight 
    pq.add(new pair(0, 0));

    while(!pq.isEmpty()){
        pair curr=pq.remove();
        if(!vis[curr.node]){
            vis[curr.node]=true;
            
            for(int i=0;i<graph[curr.node].size();i++) {
                Edge e=graph[curr.node].get(i);
                int u=e.src;
                int v1=e.dec;
                if(dis[u]+e.wt<dis[v1]){
                    dis[v1]=dis[u]+e.wt;
                    pq.add(new pair(v1,dis[v1]));
                }
            }
            
        }
    }
        for(int i=0;i<v;i++){
            System.out.print(dis[i]+" ");
        }
        System.out.println();
            

}
public static void main(String[] args) {
    int v=6;
    ArrayList<Edge> graph[]=new ArrayList[v];
    create(graph);
    dijkstra(graph, 0, v);
}


}