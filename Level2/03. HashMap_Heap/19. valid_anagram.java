import java.util.*;

public class Main {
	
	public static boolean solution(String s, String t){
		if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int nf = hm.getOrDefault(ch, 0) + 1;
            hm.put(ch, nf);
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = t.charAt(i);
            int nf = hm.getOrDefault(ch, 0) - 1;
            hm.put(ch, nf);
        }
        for(char key : hm.keySet()){
            if(hm.get(key) != 0){
                return false;
            }
        }
        return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}