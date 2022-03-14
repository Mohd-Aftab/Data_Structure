import java.io.*;
import java.util.*;

public class perfect_friends {
   

   public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      ArrayList<Integer>[] graph = new ArrayList[n];
      for(int i=0; i<n; i++){
          graph[i] = new ArrayList<>();
      }
      while(k-- > 0){
          int u = scn.nextInt();
          int v = scn.nextInt();
          graph[u].add(v);
          graph[v].add(u);
      }
      // write your code here
      
      int ways = 0;
      ArrayList<Integer> waysArr = new ArrayList<>();
      boolean[] visited = new boolean[n];
      for(int i=0; i<n; i++){
          if(visited[i] == false){
              travel(graph, visited, i);
              waysArr.add(grpF);
              grpF = 0;
          }
      }
      
      
      for(int i=0; i<waysArr.size(); i++){
          int ele = waysArr.get(i);
          int sum = 0;
         for(int j=i+1; j<waysArr.size(); j++){
             int x = waysArr.get(j);
             sum += (x*ele);
         }
         ways += sum;
      }
      System.out.println(ways);
   }
   static int grpF = 0;
   public static void travel(ArrayList<Integer>[] graph, boolean[] visited, int src){
       visited[src] = true;
       grpF = grpF + 1;
       for(int ele : graph[src]){
           if(visited[ele] == false){
               travel(graph, visited, ele);
           }
       }
   }

}