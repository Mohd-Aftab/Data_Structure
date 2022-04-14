import java.util.*;

public class Main {
    public static boolean IsVowel(char a){
        String vowel = "aeiouAEIOU";
        int idx = vowel.indexOf(a);
        if(idx == -1){
            return false;
        }else{
            return true;
        }
    }
  // ~~~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static String reverseVowels(String s) {
    // write your code here
    char arr[] = s.toCharArray();
    int i=0, j=arr.length-1;
    while(i < j){
        while(i < j && IsVowel(arr[i]) == false){
            i++;
        }while(i < j && IsVowel(arr[j]) == false){
            j--;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    return new String(arr);
  }

  // ~~~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    String res = reverseVowels(str);
    System.out.println(res);
  }
}