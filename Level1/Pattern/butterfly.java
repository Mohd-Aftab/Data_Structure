import java.io.*;
import java.util.*;

public class butterfly{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = 2*n - 2;
        int row = 1;
        while(row < 2*n){
            for(int i=1; i<=nst; i++){
                System.out.print("*");
            }
            for(int i=1; i<=nsp; i++){
                System.out.print(" ");
            }
            for(int i=1; i<=nst; i++){
                System.out.print("*");
            }
            if(row < n){
                nst += 1;
                nsp-=2;
            }else{
                nst-=1;
                nsp+=2;
            }
            row++;
            System.out.println();
        }
    }
}