import java.util.*;

public class Main {

  // ~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~
  public static ArrayList<Integer> pascalRow(int r) {
    // write your code here
    long val = 1;
    ArrayList<Integer> ans = new ArrayList<>();
    ans.add(1);
    for(int i=0; i<r; i++){
        val = (val*(r-i))/(i+1);
        ans.add((int)val);
    }
    return ans;
  }

  // ~~~~~~~~~~~Input management~~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    ArrayList<Integer> res = pascalRow(n);
    for (int val : res) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}