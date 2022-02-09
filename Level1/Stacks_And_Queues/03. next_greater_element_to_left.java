import java.io.*;
import java.util.*;

public class next_greater_elements_to_left{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "");
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
        int n = arr.length;
        int nge[] = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        nge[n-1] = -1;
        
        for(int i=n-2; i>=0; i--){
            //if(s.size() > 0){
                while(s.peek() < arr[i]){
                    s.pop();
                    if(s.size() == 0){
                        break;
                    }
                }
            //}
            if(s.size() == 0){
                nge[i] = -1;
                s.push(arr[i]);
            }else{
                nge[i] = s.peek();
                s.push(arr[i]);
            }
        }
        return nge;
    }

}