import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortinginDAG {
        public static class Edge{
            int src;
            int dec;
            Edge(int src,int dec){
                this.src=src;
                this.dec=dec;
            }
        }
    public static void create(ArrayList<Edge> graph[]){
        // create the empytlist inside the grpah 
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2 , 3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5,2));

    }

    // 
    public static void topSortUtill(ArrayList<Edge> graph[],int curr,boolean vis[], Stack<Integer> stack ){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dec]){
                topSortUtill(graph, e.dec, vis, stack);
            }
        }
        stack.push(curr);
    }
    public static void topsort(ArrayList<Edge> graph[],int v){
        boolean vis[]=new boolean[v];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<v;i++){      
            if(!vis[i]){
                topSortUtill(graph,i, vis, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph);
        topsort(graph, v);

    }
}
