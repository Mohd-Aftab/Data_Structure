import java.util.*;

public class Main {


  //~~~~~~~~~~~~~~~User's Section~~~~~~~~~~~~~~~~~
  public static int firstMissingPositive(int[] arr) {
    // write your code here
    int pe = segregate(arr);
    for(int i=0; i<=pe; i++){
        int ele = Math.abs(arr[i]) - 1;
        if(ele <= pe && arr[ele] > 0){
            arr[ele] = -arr[ele];
        }
    }
    for(int i=0; i<=pe; i++){
        if(arr[i] > 0){
            return i+1;
        }
    }
    return pe+2;
    
  }
  public static int segregate(int arr[]){
      int i=0;
      int j=0;
      while(j < arr.length){
          if(arr[j] < 0){
              j++;
          }else{
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
              j++;
          }
      }
      return i-1;
  }

  //~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int res = firstMissingPositive(arr);
    System.out.println(res);
  }
}