import java.util.*;

public class Main {

  // ~~~~~~~~~~~~~~User's Section~~~~~~~~~~~~~~~
  public static int partitionDisjoint(int[] arr) {
    // write your code here
    int rmin[] = new int[arr.length+1];
    rmin[arr.length] = Integer.MAX_VALUE;
    for(int i=arr.length-1; i>=0; i--){
        rmin[i] = Math.min(arr[i], rmin[i+1]);
    }
    int lmax = 0;
    for(int i=0; i<arr.length; i++){
        lmax = Math.max(arr[i], lmax);
        if(lmax < rmin[i+1]){
            return i+1;
        }
    }
    return 0;
  }

  // ~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int len = partitionDisjoint(arr);
    System.out.println(len);
  }
}