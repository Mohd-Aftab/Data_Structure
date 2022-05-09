import java.io.*;
import java.util.*;

public class Main {
  public static String removeOuterParentheses(String str) {
    // write your code here
    StringBuilder ans = new StringBuilder("");
    Stack<Character> st = new Stack<>();
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch == '('){
            st.push(ch);
            if(st.size() > 1){
                ans.append(ch);
            }
        }else if(ch == ')'){
            st.pop();
            if(st.size() > 0){
                ans.append(')');
            }
        }
    }
    return ans.toString();
  }

  public static void main(String[] args) throws Exception {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    String result = removeOuterParentheses(read.readLine());
    System.out.println(result);
  }
}