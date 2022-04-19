import java.util.*;
import java.io.*;

public class Main {

    /*You have to complete union function and return an Arraylist which contains union elements of the two arrays*/
    public static ArrayList<Integer> union(int[] a,int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                int ele = list.size() > 0 ? list.get(list.size()-1) : Integer.MIN_VALUE;
                if(a[i] != ele){
                    list.add(a[i]);
                }
                i++;
            }else if(a[i] > b[j]){
                int ele = list.size() > 0 ? list.get(list.size()-1) : Integer.MIN_VALUE;
                if(b[j] != ele){
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i < a.length){
            int ele = list.size() > 0 ? list.get(list.size()-1) : Integer.MIN_VALUE;
            if(a[i] != ele){
                list.add(a[i]);
            }
            i++;
        }
        while(j < b.length){
            int ele = list.size() > 0 ? list.get(list.size()-1) : Integer.MIN_VALUE;
            if(b[j] != ele){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        //input work
        int n = scn.nextInt();
        int[]a = new int[n];
        for(int i=0; i < n;i++) {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[]b = new int[m];
        for(int i=0;i < m;i++) {
            b[i] = scn.nextInt();
        }

        ArrayList<Integer>ans = union(a,b);

        //print answer list
        for(int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}