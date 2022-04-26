import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    HashMap<String, String> map = new HashMap<>();
    for(int i=0; i<n; i++){
        map.put(scn.next(), scn.next());
    }
    findCount(map);
  }
  
  public static void findCount(HashMap<String, String> map){
      HashMap<String, ArrayList<String>> tree = new HashMap<>(); // manager vs employees
      String ceo = "";
      
      for(String emp : map.keySet()){
          String man = map.get(emp);
          
          if(man.equals(emp)){
              ceo = man;
          }else{
              ArrayList<String> empList = tree.getOrDefault(man, new ArrayList<>());
              empList.add(emp);
              tree.put(man, empList);
          }
      }
      HashMap<String, Integer> result = new HashMap();
      getSize(tree, ceo, result);
    //   System.out.println(result);
      for(String key : result.keySet()){
          System.out.println(key + " " + result.get(key));
      }
  }
  
  public static int getSize(HashMap<String, ArrayList<String>> tree, String man, HashMap<String, Integer> result){
      
      if(!tree.containsKey(man)){
          result.put(man, 0);
          return 1;
      }
      
      int ms = 0;
      for(String child : tree.get(man)){
          int cs = getSize(tree, child, result);
          ms += cs;
      }
      result.put(man, ms);
      return ms+1;
  }

}