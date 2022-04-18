import java.util.*;
import java.io.*;

public class Main {

    /*find 'k' closest element to 'x' and return answer list*/
    /*elements in answer list should be in ascending order*/
    public static class Pair implements Comparable<Pair>{
        int ele;
        int diff;
        Pair(){
            
        }
        Pair(int ele, int diff){
            this.ele = ele;
            this.diff = diff;
        }
        public int compareTo(Pair o){
            if(this.diff == o.diff){
                return this.ele - o.ele;
            }
            else return -(this.diff - o.diff);
        }
    }
    public static ArrayList<Integer> findClosest(int[]arr,int k,int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            int diff = Math.abs(arr[i]-x);
            if(pq.size() < k){
                Pair p = new Pair(arr[i], diff);
                pq.add(p);
            }else{
                if(pq.peek().diff > diff){
                    pq.remove();
                    Pair p = new Pair(arr[i], diff);
                    pq.add(p);
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        while(pq.size() > 0){
            al.add(pq.remove().ele);
        }
        return al;
        
    }

    public static void main(String[]args) {

        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for(int i=0; i < n;i++) {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        int x = scn.nextInt();

        ArrayList<Integer>ans = findClosest(arr,k,x);

        for(int val : ans) {
            System.out.print(val + " ");
        }

    }
}