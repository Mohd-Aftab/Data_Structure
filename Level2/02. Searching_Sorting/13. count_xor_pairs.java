import java.util.*;
import java.io.*;

public class Main {
  public static int countPairs(int[]arr) {
      HashMap<Integer, Integer> hm = new HashMap<>();
      for(int ele : arr){
          int nf = hm.getOrDefault(ele, 0) + 1;
          hm.put(ele, nf);
      }
      int count = 0;
      for(int key : hm.keySet()){
          int c = hm.get(key);
          count += ((c-1)*(c))/2;
      }
      return count;
  }

  public static void main(String[]args) {
    //input work
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.println(countPairs(arr));
  }
}