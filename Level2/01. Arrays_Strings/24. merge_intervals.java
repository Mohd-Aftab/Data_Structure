import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static int[][] mergeIntervals(int intervals[][]){
        // write your code here
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) ->{
            return a[0] - b[0];
        });
        
        if(intervals.length == 0){
            return new int[0][0];
        }
        
        ans.add(intervals[0]);
        int i=1;
        int li = 0;
        while(i < intervals.length){
            if(intervals[i][0] < ans.get(li)[1]){
                ans.get(li)[1] = Math.max(ans.get(li)[1], intervals[i][1]);
            }else{
                ans.add(intervals[i]);
                li++;
            }
            i++;
        }
        
        
        int[][] fres = new int[ans.size()][2];
        fres = ans.toArray(fres);
        return fres;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        // Input Format
        int n = scn.nextInt();
        int input[][] = new int[n][2];

        for(int i = 0 ; i <  n ; i++){
            int sp = scn.nextInt();
            int ep = scn.nextInt();

            input[i][0] = sp;
            input[i][1] = ep;
        }

        // Output Format
        int [][]output = mergeIntervals(input);

        System.out.print("[");
        for(int arr[] : output){
            System.out.print(Arrays.toString(arr));
        }
        System.out.println("]");
    }
}