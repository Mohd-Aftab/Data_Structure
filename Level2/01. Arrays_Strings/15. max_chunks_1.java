import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~
    public static int maxChunksToSorted(int[] arr) {
        int maxR = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++){
            int ele = arr[i];
            if(ele > maxR){
                if(i > maxR){
                    count++;
                }
                maxR = ele;
            }
        }
        return count;
    }

    // ~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = maxChunksToSorted(arr);
        System.out.println(res);
    }
}