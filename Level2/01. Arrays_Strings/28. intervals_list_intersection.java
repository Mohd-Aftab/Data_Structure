import java.util.*;

public class Main {
  public static int[][] intersection(int intervalList1[][], int intervalList2[][]) {
    ArrayList<int[]> al = new ArrayList<>();
    int i = 0, j = 0;
    while(i < intervalList1.length && j < intervalList2.length){
        int asp = intervalList1[i][0];
        int aep = intervalList1[i][1];
        int bsp = intervalList2[j][0];
        int bep = intervalList2[j][1];
        
        int sp = -1;
        int ep = -1;
        sp = Math.max(asp, bsp);
        ep = Math.min(aep, bep);
        if(sp <= ep){
            int sa[] = {sp, ep};
            al.add(sa);
        }
        if(bep > ep){
            i++;
        }else{
            j++;
        }
    }
    return al.toArray(new int[al.size()][]);
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // Input format
    int n = scn.nextInt();
    int list1[][] = new int[n][2];
    for (int i = 0 ; i < n ; i++) {
      list1[i][0] = scn.nextInt();
      list1[i][1] = scn.nextInt();
    }

    int m = scn.nextInt();
    int list2[][] = new int[m][2];
    for (int i = 0 ; i < m ; i++) {
      list2[i][0] = scn.nextInt();
      list2[i][1] = scn.nextInt();
    }

    // output
    int ans[][] = intersection(list1, list2);
    System.out.print("[");
    for (int interval[] : ans) {
      System.out.print(Arrays.toString(interval));
    }
    System.out.println("]");
  }
}