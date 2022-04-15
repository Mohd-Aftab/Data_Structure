import java.util.*;

public class Main {

  public static String addStrings(String num1, String num2) {
      int i=num1.length() - 1, j = num2.length() - 1;
      int carry = 0;
      
      String ans = "";
      while(i >= 0 && j >= 0){
          int n1 = Integer.parseInt(num1.charAt(i)+"");
          int n2 = Integer.parseInt(num2.charAt(j)+"");
          int sum = n1 + n2 + carry;
          carry = sum/10;
          int dig = sum % 10;
          ans = dig + ans;
          i--;
          j--;
      }
      while(i >= 0){
          int n1 = Integer.parseInt(num1.charAt(i)+"");
          int sum = n1 + carry;
          carry = sum/10;
          int dig = sum % 10;
          ans = dig + ans;
          i--;
      }
      while(j >= 0){
          int n2 = Integer.parseInt(num2.charAt(j)+"");
          int sum = n2 + carry;
          carry = sum/10;
          int dig = sum % 10;
          ans = dig + ans;
          j--;
      }
      return ans;
  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String n1 = scn.nextLine();
    String n2 = scn.nextLine();

    String res = addStrings(n1, n2);
    System.out.println(res);
  }
}