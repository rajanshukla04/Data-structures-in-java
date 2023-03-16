import java.util.ArrayList;

public class cycleGraph {
    public static class Edge{
        int src;
        int dec;
        Edge(int src,int dec){
            this.src=src;
            this.dec=dec;
        }
    }
public static void create(ArrayList<Edge> graph[]){
    
    // create the empyt list inside the  array to store the graph 
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0, 2));
    graph[1].add(new Edge(1, 0));
    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 0));

}
public static boolean isCycleGraph(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
    vis[curr]=true;
    rec[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(rec[e.dec]){
            return true;
        }
        else if(!vis[e.dec]){
            if(isCycleGraph(graph, vis, e.dec, rec)){
                return true;
            }
        }
    }
    rec[curr]=false;
    return false;
}
    public static void main(String args[]){
        int v=4;
        // create the edgency list to store the graph 
        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph);
        System.out.println(isCycleGraph(graph,new boolean[v], 0,new boolean[v]));
    

    }

}
