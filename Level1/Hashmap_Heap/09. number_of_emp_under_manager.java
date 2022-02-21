import java.io.*;
import java.util.*;

public class number_of_emp_under_manager {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    HashMap<String, String> empMan = new HashMap<>(); // employee vs manager
    int x = n-1;
    while(x >= 0){
        String emp = scn.next();
        String man = scn.next();
        empMan.put(emp, man);
        x--;
    }
    String ceo = "";
    //Convert data into generic tree
    HashMap<String, ArrayList<String>> map = new HashMap<>();
    for(String emp : empMan.keySet()){
        String man = empMan.get(emp);
        if(man.equals(emp)){
            ceo = man;
            ArrayList<String> list = map.getOrDefault(emp, new ArrayList<>());
            map.put(emp, list);
            continue;
        }
        ArrayList<String> list = map.getOrDefault(man, new ArrayList<>());
        list.add(emp);
        map.put(man, list);
        
        ArrayList<String> list1 = map.getOrDefault(emp, new ArrayList<>());
        map.put(emp, list1);
    }
    HashMap<String, Integer> ans = new HashMap<>();
    getSize(ceo, map, ans);
    for(String key : ans.keySet()){
        System.out.println(key +" " + ans.get(key));
    }
  }
  
  public static int getSize(String emp, HashMap<String, ArrayList<String>> map, HashMap<String, Integer> ans){
      int size = 0;
      for(String child : map.get(emp)){
          size += getSize(child, map, ans); 
      }
      ans.put(emp, size);
      return size+1;
  }

}