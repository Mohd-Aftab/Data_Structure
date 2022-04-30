import java.io.*;
import java.util.*;

public class Main {

    public static int numRabbits(int[] answers) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele : answers){
            if(hm.containsKey(ele) == false){
                hm.put(ele, 1);
            }else{
                int nf = hm.get(ele) + 1;
                hm.put(ele, nf);
            }
        }
        int mr = 0;
        for(int key : hm.keySet()){
            int gs = key + 1;
            int val = hm.get(key);
            mr += Math.ceil(val*1.0/gs)*gs;
        }
        return mr;
    }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] answers = new int[n];
    for (int i = 0; i < answers.length; i++) {
        answers[i] = scn.nextInt();
    }

    System.out.println(numRabbits(answers));
  }

}