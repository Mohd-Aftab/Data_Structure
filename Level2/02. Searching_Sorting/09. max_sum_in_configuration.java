import java.util.*;

public class Main {

    public static int maximise(int[]arr) {
        int si = 0;
        int sum = 0;
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            si += (arr[i]*i);
            sum += arr[i];
        }
        int maxS = si;
        for(int i=0; i<n-1; i++){
            int sip1 = si + sum - n*arr[n-i-1];
            maxS = Math.max(maxS, sip1);
            si = sip1;
        }
        return maxS;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = maximise(arr);
        System.out.println(ans);
    }
}