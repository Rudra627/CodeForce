import java.util.*;
public class Graph3{
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static boolean cycledetection(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!vis[i]){
                if(cyclehelper(graph, vis, stack, i)) return true;
            }
        }
        return false;
    }
    public static boolean cyclehelper(ArrayList<Edge>[] graph, boolean vis[], boolean stack[], int curr){
       vis[curr] = true;
       stack[curr] = true;
       for(int i=0;i<graph[curr].size();i++){
        Edge e= graph[curr].get(i);
        if(stack[e.dest])return true;
        if(!vis[e.dest]){
            if(cyclehelper(graph, vis, stack, e.dest)) return true;
        }
        else if(stack[e.dest]) return true;
       }
       stack[curr] = false;
       return false;
    }
    public static void topologicalsort(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topologicalutil(graph, i, vis, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void topologicalutil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalutil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void printAllpath(ArrayList<Edge>[] graph,int src,int des,String path){
        if(src==des){
            System.out.print(path+des);
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            printAllpath(graph,e.dest,des,path+src);
        }
    }
    public static void main(String args[]){
        int v=6;
        ArrayList<Edge>[] graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        // graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,2));
        // graph[1].add(new Edge(1,3));
        // graph[1].add(new Edge(1,4));
        // graph[2].add(new Edge(2,3));
        // graph[3].add(new Edge(3,4));
        // System.out.println(cycledetection(graph));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
        topologicalsort(graph);
        printAllpath(graph, 5, 1, "");
    }
}