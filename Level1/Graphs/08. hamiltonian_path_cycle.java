import java.io.*;
import java.util.*;

public class hamiltonian_path_cycle {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());

      // write all your codes here
      boolean visited[] = new boolean[vtces];
      hamiltonian(graph, src, src, visited, ""+src);
   }
    
    public static void hamiltonian(ArrayList<Edge>[] graph,int osrc, int src, boolean vis[], String psf){
        if(psf.length() == graph.length){
            // psf => hamiltonian path or cycle
            boolean isHC = false; // hamiltonian cycle
            for(Edge edge : graph[osrc]){
                int nbr = edge.nbr;
                
                if(nbr == src){
                    isHC = true;
                    break;
                }
            }
            System.out.print(psf);
            if(isHC){
                // cycle
                System.out.println('*');
            }else{
                System.out.println('.');
            }
            
        }
        vis[src] = true;
        
        for(Edge edge : graph[src]){
            int nbr = edge.nbr;
            
            if(vis[nbr] == false){
                hamiltonian(graph, osrc, nbr, vis, psf + nbr);
            }
        }
        vis[src] = false;
    }

}