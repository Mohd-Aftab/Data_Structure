import java.util.*;
import java.io.*;

public class Main {
    public static class Pair{
        int js;
        int jl;
        
        Pair(){
            
        }
        Pair(int js, int jl){
            this.js = js;
            this.jl = jl;
        }
    }
  public static int findRadius(int[]houses, int[]heaters) {
      Arrays.sort(heaters);
      int max = 0;
      for(int i=0; i<houses.length; i++){
          Pair p = helper(heaters, houses[i]);
          int ld = p.js == -1 ? Integer.MAX_VALUE : houses[i] - p.js;
          int rd = p.jl == -1 ? Integer.MAX_VALUE : p.jl - houses[i];
          max = Math.max(max, Math.min(ld, rd));
      }
      return max;
  }
  public static Pair helper(int arr[], int tar){
      int lo=0, hi=arr.length-1;
      int js = -1, jl = -1;
      while(lo <= hi){
          int mid = (lo + hi) / 2;
          if(arr[mid] == tar){
              js = arr[mid];
              jl = arr[mid];
              return new Pair(js, jl);
          }
          if(arr[mid] < tar){
              js = arr[mid];
              lo = mid + 1;
          }else{
              jl = arr[mid];
              hi = mid - 1;
          }
      }
      return new Pair(js, jl);
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]houses = new int[n];

    for (int i = 0; i < n; i++) {
      houses[i] = scn.nextInt();
    }

    int m = scn.nextInt();
    int[]heaters = new int[m];

    for (int i = 0; i < m; i++) {
      heaters[i] = scn.nextInt();
    }

    System.out.println(findRadius(houses, heaters));
  }
}