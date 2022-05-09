import java.io.*;
import java.util.*;

public class Main {
    public static int scoreOfParentheses(String str) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(-1);
            }else{
                int cs = 0;
                while(st.size() > 0 && st.peek() != -1){
                    cs += st.pop();
                }
                st.pop();
                if(cs == 0){
                    st.push(1);
                }else{
                    st.push(2*cs);
                }
            }
        }
        int ans = 0;
        while(st.size() > 0){
            ans += st.pop();
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int score = scoreOfParentheses(read.readLine());
        System.out.println(score);
        
    }
}