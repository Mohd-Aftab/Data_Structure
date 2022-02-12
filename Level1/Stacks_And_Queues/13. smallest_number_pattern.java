/* 
examples:
        d -> 21
        i -> 12
        ddd -> 4321
        iii -> 1234
        dddiddd -> 43218765
        iiddd -> 126543
        ddddiiii -> 543216789
*/



import java.io.*;
import java.util.*;

public class smallest_number_pattern{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    StringBuilder sb = new StringBuilder("");
    Stack<Integer> st = new Stack<>();
    int count = 0;
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch == 'i'){
            count += 1;
            sb.append(count+"");
            while(st.size() > 0){
                sb.append(st.pop()+"");
            }
        }else if(ch == 'd'){
            count+=1;
            st.push(count);
        }
    }
    count+=1;
    sb.append(count+"");
    while(st.size() > 0){
        sb.append(st.pop()+"");
    }
    System.out.println(sb);
 }
}