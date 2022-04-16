import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static boolean meetingRooms(int intervals[][]){
        // write code here
        if(intervals.length == 0){
            return true;
        }
        Arrays.sort(intervals, (a, b)->{
            return a[0] - b[0];
        });
        int liep = intervals[0][1];
        int i=1;
        while(i < intervals.length){
            int csp = intervals[i][0];
            int cep = intervals[i][1];
            if(csp < liep){
                return false;
            }else{
                liep = Math.max(liep, cep);
            }
            i++;
        }
        return true;
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
        boolean res = meetingRooms(input);
        System.out.println(res);
    }
}