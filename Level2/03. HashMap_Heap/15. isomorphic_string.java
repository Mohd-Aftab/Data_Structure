/* 
Two strings are called isomorphic if -
    -> Every character of s1 can be mapped with characters of s2.
    -> A character of s1 can be mapped to only one character.
    -> All occurrences of a character must be replaced with another character while preserving the order of characters.
*/
import java.util.*;

public class Main {

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