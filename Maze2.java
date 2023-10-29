import java.util.*;
public class printPaths { 
  
  /* 
     Printing the possible paths to reach the end of the board
     This is same as Maze1.java, just a slight modification in printing direction format
     Note:Considering that we can move only in Rightward & Downward Direction
  */
  
  static void printPaths(String path, int row, int col)
  {
      /*
        Base Condition : When we reach the last cell, i.e., When row==col==1
        In this case we print the path and return
      */
      if(row == 1 && col == 1)
      {
        //omiting last symbols i.e., "->"
        System.out.println(path.substring(0,path.length()-2));
        return;
      }
         
      /*
        Function to move Downward Direction :
        Downward Direction depicts that we will remain in the same column but different row
        Therefore, We decrease the row by 1
      */
      if(row > 1)
      {
        printPaths(path+"Down->", row-1, col);
      }
      
      /*
        Function to move Rightward Direction :
        Rightward Direction depicts that we will remain in the same row but different column
        Therefore, We decrease the column by 1
      */
      if(col > 1)
      {
        printPaths(path+"Right->", row, col-1);
      }
  }
  
  public static void main(String[] args) {
    printPaths("",4,4);
  }
}