import java.util.*;

public class isomorphic_strings {

	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char val = t.charAt(i);
            char ch = s.charAt(i);
            if(map.containsKey(ch) == false){
                if(set.contains(val)){
                    return false;
                }
                map.put(ch, val);
                set.add(val);
            }else{
                if(map.get(ch) != val){
                    return false;
                }
            }
        }
        return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String A = scn.next();
		String B = scn.next();
		System.out.print(isIsomorphic(A, B));
	}

}
