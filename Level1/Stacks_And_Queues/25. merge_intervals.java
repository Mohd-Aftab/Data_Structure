import java.io.*;
import java.util.*;

public class merge_intervals {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }
    
    public static class Interval{
        int st;
        int et;
        
        Interval(){
            
        }
        Interval(int st, int et){
            this.st = st;
            this.et = et;
        }
    }
    
    public static void mergeOverlappingIntervals(int[][] a) {
        Interval[] arr = new Interval[a.length];
        for(int i=0; i<arr.length; i++){
            Interval curr = new Interval(a[i][0], a[i][1]);
            arr[i] = curr;
        }
        Arrays.sort(arr, (x, b)->{
            return x.st - b.st;
        });
        Stack<Interval> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            Interval curr = arr[i];
            if(st.peek().et < curr.st){
                st.push(curr);
            }else{
                st.peek().et = Math.max(st.peek().et, curr.et);
            }
        }
        Stack<Interval> res = new Stack<>();
        while(st.size() > 0){
            res.push(st.pop());
        }
        while(res.size() > 0){
            Interval curr = res.pop();
            System.out.println(curr.st + " " + curr.et);
        }
    }

}
