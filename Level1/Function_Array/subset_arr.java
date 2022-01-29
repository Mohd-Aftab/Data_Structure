import java.io.*;
import java.util.*;

public class subset_arr{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        int lim = (int)(Math.pow(2, n));
        for(int i=0; i<lim; i++){
            String set = "";
            int temp = i;
            for(int j=n-1; j>=0; j--){
                int r = temp % 2;
                temp = temp/2;
                if(r == 0){
                    set = "-	"+set;
                }else{
                    set = arr[j]+"	"+set;
                }
            }
            System.out.println(set);
        }
    }

}