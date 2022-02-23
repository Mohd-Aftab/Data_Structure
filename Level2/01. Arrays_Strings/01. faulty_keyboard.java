import java.util.*;

public class faulty_keyboard {

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static boolean isPossible(String name, String typed) {
        // Write your code here
        if(name.length() > typed.length()){
            return false;
        }
        int i=0, j=0;
        while(i < name.length() && j < typed.length()){
            char c1 = name.charAt(i);
            char c2 = typed.charAt(j);
            if(c1 == c2){
                i++;
                j++;
            }else if(i > 0 &&  c2 == name.charAt(i-1)){
                j++;
            }else{
                return false;
            }
        }
        if(i != name.length()){
            return false;
        }
        while(j != typed.length()){
            char c1 = name.charAt(i-1);
            char c2 = typed.charAt(j);
            if(c1 == c2){
                j++;
            }else{
                return false;
            }
        }
        return true;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String name = scn.next();
        String typed = scn.next();

        boolean res = isPossible(name, typed);

        System.out.println(res);
    }
}