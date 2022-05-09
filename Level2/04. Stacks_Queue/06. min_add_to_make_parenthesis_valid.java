import java.io.*;
import java.util.*;

public class Main {
    public static int minAddToMakeValid(String str) {
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else{
                if(st.size() == 0){
                    count++;
                }else{
                    st.pop();
                }
            }
        }
        return count+st.size();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int result = minAddToMakeValid(read.readLine());
        System.out.println(result);
    }
}