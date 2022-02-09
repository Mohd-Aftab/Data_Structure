import java.io.*;
import java.util.*;

public class balanced_brackets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(balanced(str));
    }
    
    public static boolean balanced(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size() == 0 || st.peek() != '('){
                    return false;
                }
                st.pop();
            }else if(ch == '}'){
                if(st.size() == 0 || st.peek() != '{'){
                    return false;
                }
                st.pop();
            }else if(ch == ']'){
                if(st.size() == 0 || st.peek() != '['){
                    return false;
                }
                st.pop();
            }
        }
        return st.size() == 0;
    }

}