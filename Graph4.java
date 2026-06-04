import java.util.*;

public class Graph4{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static class pair implements Comparable<pair>{
        int n;
        int path;
        public pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        @Override
        public int compareTo(pair p2){
            return this.path-p2.path;
        }
    }
    public static void creategraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
       graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }
    public static void bellmanford(ArrayList<Edge>[] graph,int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!=src) dist[i]=Integer.MAX_VALUE;
        }
        int v=graph.length;
        for(int i=0;i<v-1;i++){
            for(int j=0;j<v;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v1=e.dest;
                    int wt=e.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v1]){
                        dist[v1]=dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            System.out.println(dist[i]+" ");
        }
    }
    public static void dijkstra(ArrayList<Edge>[] graph,int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!=src) dist[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[graph.length];
        pq.add(new pair(src, 0));
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    if(dist[curr.n]+e.wt<dist[e.dest]){
                        dist[e.dest]=dist[curr.n]+e.wt;
                        pq.add(new pair(e.dest, dist[e.dest]));
                    }
                }
            }
            for(int i=0;i<dist.length;i++){
                System.out.println(dist[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        creategraph(graph);
        // dijkstra(graph, 0);
        bellmanford(graph, 0);
    }   
}