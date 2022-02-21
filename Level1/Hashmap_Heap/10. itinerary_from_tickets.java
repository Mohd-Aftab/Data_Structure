import java.util.*;

public class itinerary_from_tickets {
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
        HashMap<String, Boolean> sp = new HashMap<>();
        for(String key : map.keySet()){
            String src = key;
            String dest = map.get(key);
            sp.put(dest, false);
            boolean srcCheck = sp.getOrDefault(src, true);
            sp.put(src, srcCheck);
        }
        String root = "";
        for(String key : sp.keySet()){
            if(sp.get(key) == true){
                root = key;
                break;
            }
        }
        while(map.containsKey(root) == true){
            System.out.print(root + " -> ");
            root = map.get(root);
        }
        System.out.print(root +".");
	}
}
