import java.io.*;
import java.util.*;

public class print_encodings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        String ques = scn.nextLine();
        
        printEncodings(ques,"");
    }
    
    static char encoder[] = {' ','a','b','c','d',
                                'e','f','g','h',
                                'i','j','k','l',
                                'm','n','o','p',
                                'q','r','s','t',
                                'u','v','w','x',
                                'y','z'};
    public static void printEncodings(String qsf,String asf) {
        if(qsf.length() == 0){
            System.out.println(asf);
            return;
        }
        
        char c1 = qsf.charAt(0); 
        if(c1 == '0'){
            return;
        }
        
        printEncodings(qsf.substring(1) , asf + encoder[c1-'0']);
        
        if(qsf.length() > 1){
            char c2 = qsf.charAt(1); 
            String tmp = ""+c1+c2; 
            int num = Integer.parseInt(tmp); 
            
            if(num >= 1 && num <= 26){
                printEncodings(qsf.substring(2),asf+encoder[num]);
            }
        }
    }

}