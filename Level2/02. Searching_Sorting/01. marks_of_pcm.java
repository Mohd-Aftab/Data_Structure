import java.util.*;
import java.io.*;

public class Main {
    
    public static class Pair implements Comparable<Pair>{
        int p;
        int c;
        int m;
        
        Pair(){
            
        }
        Pair(int p, int c, int m){
            this.p = p;
            this.c = c;
            this.m = m;
        }
        
        public int compareTo(Pair o){
            if(this.p != o.p){
                return this.p - o.p;
            }else if(this.c != o.c){
                return -(this.c - o.c);
            }else{
                return this.m - o.m;
            }
        }
    }
    
    public static void customSort(int[]phy,int[]chem,int[]math) {
        //write your code here
        int n = phy.length;
        Pair[] arr = new Pair[n];
        for(int i=0; i<n; i++){
            int p = phy[i];
            int c = chem[i];
            int m = math[i];
            Pair x = new Pair(p, c, m);
            arr[i] = x;
        }
        
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            phy[i] = arr[i].p;
            chem[i] = arr[i].c;
            math[i] = arr[i].m;
        }
        
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        //input work
        int N = scn.nextInt();

        int[]phy = new int[N];
        int[]chem = new int[N];
        int[]math = new int[N];

        for(int i=0; i < N;i++) {
            phy[i] = scn.nextInt();
        }

        for(int i=0; i < N;i++) {
            chem[i] = scn.nextInt();
        }

        for(int i=0; i < N;i++) {
            math[i] = scn.nextInt();
        }

        customSort(phy,chem,math);

        //output
        for(int i=0; i < N;i++) {
            System.out.println(phy[i] + " " + chem[i] + " " + math[i]);
        }
    }
}