import java.util.*;

public class Main {

  public static int[][] insertIntervals(int intervalList[][], int newInterval[]) {
    // write your code here
    int i=0;
    ArrayList<int[]> al = new ArrayList<>();
    while(i < intervalList.length){
        if(intervalList[i][0] <= newInterval[0]){
            al.add(intervalList[i]);
        }else{
            break;
        }
        i++;
    }
    if(i == 0 || al.get(al.size()-1)[1] < newInterval[0]){
        // no merging
        al.add(newInterval);
    }else{
        int lastInterval[] = al.get(al.size()-1);
        lastInterval[1] = Math.max(lastInterval[1], newInterval[1]);
    }
    while(i < intervalList.length){
        int lastInterval[] = al.get(al.size()-1);
        if(lastInterval[1] >= intervalList[i][0]){
            // merge
            lastInterval[1] = Math.max(lastInterval[1] , intervalList[i][1]);
        }else{
            al.add(intervalList[i]);
        }
        i++;
    }
    return al.toArray(new int[al.size()][2]);
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int intervalList[][] = new int[n][2];
    for (int i = 0 ; i < n ; i++) {
      int st = scn.nextInt();
      int et = scn.nextInt();

      intervalList[i][0] = st;
      intervalList[i][1] = et;
    }
    int newInterval[] = new int[2];
    newInterval[0] = scn.nextInt();
    newInterval[1] = scn.nextInt();

    int ans[][] = insertIntervals(intervalList, newInterval);

    System.out.print("[");
    for (int interval[] : ans) {
      System.out.print(Arrays.toString(interval));
    }
    System.out.println("]");

  }
}