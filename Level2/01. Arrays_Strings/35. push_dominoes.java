import java.util.*;

public class Main {

  // ~~~~~~~~~~~~~User's Section~~~~~~~~~~~~~~
  public static String pushDominoes(String dominoes) {
        String str = 'L' + dominoes + 'R';
        StringBuilder sb = new StringBuilder(str);
        int i=0;
        while(i < str.length()-1){
            int j=i+1;
            while(j < str.length() && str.charAt(j) == '.'){
                j++;
            }
            solve(sb, i, j);
            i=j;
        }
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    public static void solve(StringBuilder sb, int i, int j){
        if(sb.charAt(i) == 'L' && sb.charAt(j) == 'L'){
            for(int k=i+1; k<j; k++){
                sb.setCharAt(k, 'L');
            }
        }else if(sb.charAt(i) == 'L' && sb.charAt(j) == 'R'){
            //dono gir jao
        }else if(sb.charAt(i) == 'R' && sb.charAt(j) == 'R'){
            for(int k=i+1; k<j; k++){
                sb.setCharAt(k, 'R');
            }
        }else if(sb.charAt(i) == 'R' && sb.charAt(j) == 'L'){
            while(i < j){
                sb.setCharAt(i, 'R');
                sb.setCharAt(j, 'L');
                i++;
                j--;
            }
        }
    }

  // ~~~~~~~~~~~Input Management~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    String res = pushDominoes(str);
    System.out.println(res);
  }
}