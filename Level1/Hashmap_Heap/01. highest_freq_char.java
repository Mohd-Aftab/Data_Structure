import java.io.*;
import java.util.*;

public class highest_freq_char {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch) == false){
                hm.put(ch, 1);
            }else{
                int nf = hm.get(ch) + 1;
                hm.put(ch, nf);
            }
        }
        int max = 0;
        char ch = 'a';
        for(char key : hm.keySet()){
            int freq = hm.get(key);
            if(max < freq){
                max = freq;
                ch = key;
            }
        }
        System.out.println(ch);
    }

}