import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
		}

		//write your code here
		HashMap<String, Boolean> city = new HashMap<>();
		for(String src : map.keySet()){
		    String dest = map.get(src);
		    city.put(dest, false);
		    boolean srcCheck = city.getOrDefault(src, true);
		    city.put(src, srcCheck);
		}
		
		String root = "";
		for(String src : city.keySet()){
		    if(city.get(src) == true){
		        root = src;
		    }
		}
		while(map.containsKey(root)){
		    System.out.print(root + " -> ");
		    root = map.get(root);
		}
        System.out.print(root +".");
	}
}
