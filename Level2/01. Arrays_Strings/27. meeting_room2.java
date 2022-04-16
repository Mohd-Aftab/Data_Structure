import java.util.*;


public class Main {
  public static int meetingRooms(int intervals[][]) {
    // write your code here
    int n = intervals.length;
    int st[] = new int[n];
    int et[] = new int[n];
    for(int i=0; i<n; i++){
        st[i] = intervals[i][0];
        et[i] = intervals[i][1];
    }
    Arrays.sort(st);
    Arrays.sort(et);
    int i=0, j=0, max=0;
    int c=0;
    while(i < n && j < n){
        if(st[i] < et[j]){
            c++;
            i++;
        }else{
            c--;
            j++;
        }
        max = Math.max(max, c);
    }
    return max;
  }
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);

    // Input Format
    int n = scn.nextInt();
    int input[][] = new int[n][2];

    for (int i = 0 ; i <  n ; i++) {
      int sp = scn.nextInt();
      int ep = scn.nextInt();

      input[i][0] = sp;
      input[i][1] = ep;
    }

    // Output Format
    System.out.println(meetingRooms(input));
  }
}