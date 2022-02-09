import java.io.*;
import java.util.*;

public class duplicate_brackets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(duplicateBracket(str));
    }
    public static boolean duplicateBracket(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ')'){
                if(ch == ' '){
                    
                }else{
                    s.push(ch);
                }
            }else{
                int count = 0;
                while(s.peek() != '('){
                    count++;
                    s.pop();
                }
                s.pop();
                if(count == 0){
                    return true;
                }
            }
        }
        return false;
    }
}