import java.util.*;

public class Main {

  public static int findPlatform(int[] arr, int[] dep) {
    // write your code here
    Arrays.sort(arr);
    Arrays.sort(dep);
    int c = 0, marr = 0;
    int i=0; int j=0;
    while(i < arr.length && j < arr.length){
        if(arr[i] <= dep[j]){
            i++;
            c++;
        }else{
            j++;
            c--;
        }
        marr = Math.max(c, marr);
    }
    return marr;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int[] dep = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    for (int i = 0; i < n; i++) {
      dep[i] = scn.nextInt();
    }

    int plateforms = findPlatform(arr, dep);
    System.out.println(plateforms);
  }
}