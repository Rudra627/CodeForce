import java.util.*;
public class NumberIsland{
    public static void main(String args[]){
        int grid[][]={{1,1,0,0,0},
                      {1,1,0,0,0},
                      {0,0,1,0,0},
                      {0,0,0,1,1}};
        System.out.print(numIslands(grid));
    }
}