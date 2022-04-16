import java.util.*;

public class Main {

  // ~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~
  public static boolean validPalindrome(String s) {
    int i=0, j = s.length()-1;
        while(i < j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 != c2){
                if(isPalindrome(s.substring(i, j)) == true || isPalindrome(s.substring(i+1, j+1)) == true){
                    return true;
                }else{
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPalindrome(String str){
        int i=0, j=str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    boolean res = validPalindrome(str);
    System.out.println(res);
  }
}