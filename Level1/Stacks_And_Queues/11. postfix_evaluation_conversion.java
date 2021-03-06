import java.io.*;
import java.util.*;

public class postfix_evaluation_conversion {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        postfix_eval_and_conversions(exp);
    }

    public static int calculate(int v1, int v2, char opr) {
        if (opr == '+') {
            return v1 + v2;
        } else if (opr == '-') {
            return v1 - v2;
        } else if (opr == '*') {
            return v1 * v2;
        } else if (opr == '/') {
            return v1 / v2;
        } else {
            return -1;
        }
    }
    public static void postfix_eval_and_conversions(String exp) {
        //exp is a postfix expression

        Stack < Integer > valst = new Stack < > ();
        Stack < String > infix = new Stack < > ();
        Stack < String > prefix = new Stack < > ();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch >= '0' && ch <= '9') {
                //ch is an operand
                valst.push(ch - '0');
                infix.push(ch + "");
                prefix.push(ch + "");
            } 
            else if (ch == '+' || ch == '*' || ch == '/' || ch == '-') {
                //ch is an operator

                //evaluate
                char opr = ch;

                //work in value stack
                int rv = valst.pop();
                int lv = valst.pop();

                int val = calculate(lv, rv, opr);
                valst.push(val);

                //work in infix stack
                String inrv = infix.pop();
                String inlv = infix.pop();

                String inval = "(" + inlv + opr + inrv + ")";
                infix.push(inval);

                //work in prefix stack
                String prerv = prefix.pop();
                String prelv = prefix.pop();

                String preval = opr + prelv + prerv;
                prefix.push(preval);

            }
        }


        System.out.println(valst.peek());
        System.out.println(infix.peek());
        System.out.println(prefix.peek());
    }
}