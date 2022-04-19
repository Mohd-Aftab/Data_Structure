import java.util.*;
import java.io.*;

public class Main {

  public static int count(int[]arr) {
      int prev = Integer.MIN_VALUE;
      int next = Integer.MAX_VALUE;
      int count = 0;
      int n = arr.length;
      int i=0, j=n-1;
      while(i <= j){
          int n1 = Math.abs(arr[i]);
          int n2 = Math.abs(arr[j]);
          if(n1 != n2){
              if(n2 != next){
                  next = n2;
                  count++;
              }
              j--;
          }else{
              if(n1 != prev && n2 != next){
                  count++;
                  prev = n1;
                  next = n2;
              }
              i++;
              j--;
          }
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

    System.out.println(count(arr));
  }
}