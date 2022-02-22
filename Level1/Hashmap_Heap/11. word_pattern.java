import java.util.*;

public class Main {

	public static boolean wordPattern(String pattern, String s) {
		String[] arr = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        if(pattern.length() != arr.length){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            String val = arr[i];
            char ch = pattern.charAt(i);
            if(map.containsKey(ch) == false){
                if(set.contains(val)){
                    return false;
                }
                map.put(ch, val);
                set.add(val);
            }else{
                if(map.get(ch).equals(val) == false){
                    return false;
                }
            }
        }
        return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String pattern = scn.nextLine();
		String words = scn.nextLine();
		System.out.println(wordPattern(pattern,words));
	}

}
                