import java.util.*;
 
 public class Main {
 	 public static boolean areKAnagrams(String s, String t, int k) {
 	 	 HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int nf = hm.getOrDefault(ch, 0) + 1;
            hm.put(ch, nf);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(hm.containsKey(ch)){
                int nf = hm.get(ch) - 1;
                hm.put(ch, nf);
            }
        }
        int ans = 0;
        for(char key : hm.keySet()){
            int f = hm.get(key);
            if(f > 0){
                ans += f;
            }
        }
        return ans <= k;	 
 	 }
 
 	 //Don't make changes here
 	 public static void main(String[] args) {
 
 	 	 Scanner s = new Scanner(System.in);
 	 	 String str1 = s.next();
 	 	 String str2 = s.next();
 	 	 int k = s.nextInt();
 	 	 System.out.println(areKAnagrams(str1, str2, k));
 
 	 }
 
 }