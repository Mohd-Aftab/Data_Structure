import java.io.*;
import java.util.*;

public class sort_k_sorted_array {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      int x = 0;
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      int i=0; 
      while(i <= k){
          pq.add(arr[i]);
          i++;
      }
      for(; i<n; i++){
          arr[x] = pq.remove();
          pq.add(arr[i]);
          x++;
      }
      while(pq.size() > 0){
          arr[x] = pq.remove();
          x++;
      }
      for(int ele : arr){
          System.out.println(ele);
      }
   }

}
