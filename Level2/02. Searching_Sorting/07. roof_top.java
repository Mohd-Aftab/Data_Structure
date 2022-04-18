import java.util.*;

public class Main {

    public static int findMaxSteps(int[]arr) {
        int ms = 0;
        int s = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] >= arr[i-1]){
                s++;
            }else{
                ms = Math.max(ms, s);
                s = 0;
            }
        }
        ms = Math.max(s, ms);
        return ms;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findMaxSteps(arr);
        System.out.println(ans);
    }
}