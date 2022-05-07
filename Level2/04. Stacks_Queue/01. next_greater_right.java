import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "
");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

    public static int[] solve(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[n-1]);
        int[] res = new int[n];
        res[n-1] = -1;
        
        for(int i=n-2; i>=0; i--){
            int ele = arr[i];
            while(st.size() > 0 && st.peek() <= ele){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
                st.push(ele);
            }else{
                res[i] = st.peek();
                st.push(ele);
            }
        }
        return res;
    }

}