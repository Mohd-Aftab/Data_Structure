import java.util.*;

public class range_addition {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static int[] getModifiedArray(int length, int[][] updates) {
        // write your code here
        int arr[] = new int[length];
        for(int[] update : updates){
            int st = update[0];
            int ep = update[1];
            int inc = update[2];
            arr[st] += inc;
            if(ep + 1 < length){
                arr[ep+1] += -inc;
            }
        }
        for(int i=1; i<length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int length = scn.nextInt();

        int nq = scn.nextInt();
        
        int[][] queries = new int[nq][3];

        for(int q = 0; q < nq; q++) {
            queries[q][0] = scn.nextInt();
            queries[q][1] = scn.nextInt();
            queries[q][2] = scn.nextInt();
        }


        int[] res = getModifiedArray(length, queries);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}