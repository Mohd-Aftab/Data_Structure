import java.util.*;

public class Main {

  // ~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static List<List<Integer>> twoSum(int[] arr,int si,  int target) {
      List<List<Integer>> ans = new ArrayList<>();
      int i=si, j = arr.length-1;
      while(i < j){
          if(i != si && arr[i] == arr[i-1]){
              i++;
             continue;
          }
          if(arr[i] + arr[j] == target){
              List<Integer> sl = new ArrayList<>();
              sl.add(arr[i]);
              sl.add(arr[j]);
              ans.add(sl);
              i++;
              j--;
          }else if((arr[i] + arr[j]) < target){
              i++;
          }else{
              j--;
          }
      }
      return ans;
  }
  public static List<List<Integer>> threeSum(int[] arr, int targ) {
    // write your code here
    Arrays.sort(arr);
    List<List<Integer>> ans = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
        if(i != 0 && arr[i] == arr[i-1]){
            continue;
        }
        List<List<Integer>> sm = twoSum(arr, i+1, targ-arr[i]);
        if(sm.size() != 0){
            for(List<Integer> list : sm){
                list.add(arr[i]);
                ans.add(list);
            }
        }
    }
    return ans;
  }

  // ~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    List<List<Integer>> res = threeSum(arr, target);
    ArrayList<String> finalResult = new ArrayList<>();
    for (List<Integer> list : res) {
      Collections.sort(list);
      String ans = "";
      for (int val : list) {
        ans += val + " ";
      }
      finalResult.add(ans);
    }
    Collections.sort(finalResult);
    for (String str : finalResult) {
      System.out.println(str);
    }
  }

}