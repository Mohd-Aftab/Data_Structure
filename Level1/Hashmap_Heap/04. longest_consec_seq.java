import java.io.*;
import java.util.*;

public class longest_consec_seq{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int ele : arr){
            hm.put(ele, true);
        }
        
        for(int ele : arr){
            if(hm.containsKey(ele - 1)){
                hm.put(ele, false);
            }
        }
        int sp = 0;
        int sl = 0;
        for(int ele : arr){
            if(hm.get(ele) == true){
                int cl = 1;
                int csp = ele;
                while(hm.containsKey(csp + cl)){
                    cl++;
                }
                if(cl > sl){
                    sl = cl;
                    sp = csp;
                }
            }
        }
        for(int i=0; i<sl; i++){
            System.out.println(sp+i);
        }
    }

}