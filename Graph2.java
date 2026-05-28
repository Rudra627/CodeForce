import java.util.*;
public class Graph2{
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
     public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfsutil(graph, i, vis);
            }
        }
    }
    public static void dfsutil(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfsutil(graph,e.dest,vis);
            }
        }
    }
    public static boolean cycledetection(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                if(cyclehelper(graph, vis, i, -1)) return true;
            }
        }
        return false;
    }
    public static boolean cyclehelper(ArrayList<Edge>[] graph, boolean vis[], int curr, int par){
       vis[curr] = true;
       for(int i=0;i<graph[curr].size();i++){
        Edge e= graph[curr].get(i);
        if(!vis[e.dest]){
            if(cyclehelper(graph, vis, e.dest, curr)) return true;
        } 
        else if(vis[e.dest] && e.dest != par){
            return true;
        }
       }
       return false;
    }
    public static void main(String args[]){
        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
        dfs(graph);
        System.out.println();
        if(cycledetection(graph)){
            System.out.println("Cycle is present");
        } else {
            System.out.println("Cycle is not present");
        }
    }
}