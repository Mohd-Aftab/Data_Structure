import java.util.*;
  
  public class Main {
  	  public static void main(String[] args) {
  	  	  Scanner scn = new Scanner(System.in);
  	  	  int r = scn.nextInt();
  	  	  int c = scn.nextInt();
  	  	  int[][] Input = new int[r][c];
  	  	  for (int i = 0; i < r; i++) {
  	  	  	  for (int j = 0; j < c; j++) {
  	  	  	  	  Input[i][j] = scn.nextInt();
  	  	  	  }
  	  	  }
  	  	  System.out.print(numMagicSquaresInside(Input));
  	  }
  	  
  	  public static boolean isMagicSquare(int grid[][], int row, int col){
  	      if(grid[row+1][col+1] != 5){
  	          return false;
  	      }
  	      
  	      // Checking uniqueness
  	      HashSet<Integer> hs = new HashSet<>();
  	      for(int i=row; i<3; i++){
  	          for(int j=col; j<3; j++){
  	              if(hs.contains(grid[row+i][col+j])){
  	                  return false;
  	              }else{
  	                  hs.add(grid[row+i][col+j]);
  	              }
  	          }
  	      }
  	      int sr1 = grid[row][col] + grid[row][col+1] + grid[row][col+2];
  	      int sr2 = grid[row+1][col] + grid[row+1][col+1] + grid[row+1][col+2];
  	      int sr3 = grid[row+2][col] + grid[row+2][col+1] + grid[row+2][col+2];
  	      int sc1 = grid[row][col] + grid[row+1][col] + grid[row+2][col];
  	      int sc2 = grid[row][col+1] + grid[row+1][col+1] + grid[row+2][col+1];
  	      int sc3 = grid[row][col+2] + grid[row+1][col+2] + grid[row+2][col+2];
  	      int sd1 = grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2];
  	      int sd2 = grid[row][col+2] + grid[row+1][col+1] + grid[row+2][col];
  	      if(sr1 != 15 || sr2 != 15 || sr3 != 15 || sc1 != 15|| sc2 != 15|| sc3 != 15 || sd1 != 15 || sd2 != 15){
  	          return false;
  	      }
  	      return true;
  	  }
  	  
  	  // -----------------------------------------------------
  	  // This is a functional problem. Do not make changes to main
  	  // This function takes as input an array and integer k.
  	  // It should print required output.
  	  public static int numMagicSquaresInside(int[][] grid) {
  	  	  // Write your code here
  	  	  int n = grid.length;
  	  	  int m = grid[0].length;
  	  	  if(n < 3 || m < 3){
  	  	      return 0;
  	  	  }
  	  	  int count = 0;
  	  	  for(int i=0; i<=n-3; i++){
  	  	      for(int j=0; j<=m-3; j++){
  	  	          boolean check = isMagicSquare(grid, i, j);
  	  	          if(check){
  	  	              count++;
  	  	          }
  	  	      }
  	  	  }
  	  	  return count;
  	  }
  }