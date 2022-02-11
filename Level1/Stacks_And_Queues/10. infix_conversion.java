import java.io.*;
import java.util.*;

public class infix_conversion{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    pre_post(exp);
    // code
 }
 static int priority(char c){
     if(c=='+' || c=='-'){
         return 1;
     }
     if(c=='*' || c=='/'){
         return 2;
     }
     return -1;
 }
 static void pre_post(String exp){
     Stack<Character> op=new Stack<>();
     Stack<String> pre=new Stack<>();
     Stack<String> post=new Stack<>();
     int i=0;
     
     while(i<exp.length()){
         char ch=exp.charAt(i);
         if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9')){
             pre.push(""+ch);
             post.push(""+ch);
         }
         else if(ch=='('){
             op.push(ch);
         }
         
         else if(ch==')'){//evaluate till opening
             while(op.peek()!='('){
                 char top_op=op.pop();
                 String right=pre.pop();
                 String left=pre.pop();
                 String topush=top_op+left+right;
                 
                 pre.push(topush);
                 
                 right=post.pop();
                 left=post.pop();
                 topush=left+right+top_op;
                 
                 post.push(topush);
             }
             op.pop();
         }
         else if(ch=='+' || ch =='-' || ch=='*' || ch=='/'){
             while(op.size()>0 && op.peek()!='(' && priority(op.peek())>=priority(ch)){
                 //evaluate
                 char top_op=op.pop();
                 String right=pre.pop();
                 String left=pre.pop();
                 String topush=top_op+left+right;
                 
                 pre.push(topush);
                 
                 right=post.pop();
                 left=post.pop();
                 topush=left+right+top_op;
                 
                 post.push(topush);
             }
             op.push(ch);
         }
         
         
         i++;
     }
     
     while(op.size()>0){
         char top_op=op.pop();
                 String right=pre.pop();
                 String left=pre.pop();
                 String topush=top_op+left+right;
                 
                 pre.push(topush);
                 
                 right=post.pop();
                 left=post.pop();
                 topush=left+right+top_op;
                 
                 post.push(topush);
     }
     System.out.println(post.pop());
     System.out.println(pre.pop());
 }
}