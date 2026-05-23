public class Nqueen {
    public static boolean isSafe(char board[][],int row,int col){
        //vertical Safe
        for(int j=row-1;j>=0;j--){
            if(board[j][col]=='Q'){
                return false;
            }
        }

        //left Diagonal Safe
        for(int i=row-1,j=col-1;i>=0 && j>=0;j--,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //Right Diagonal Safe
        for(int i=row-1,j=col+1;i>=0 && j<board.length;j++,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueen(char board[][],int row){
        if(row==board.length){
            printBoad(board);
            count  ++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nqueen(board, row+1);
                board[row][j]='x';
            }
        }
    }
    public static void printBoad(char board[][]){
        System.out.println("----Chess Board----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nqueen(board, 0);
        System.out.println("total no of solution of n queen problem "+count);
    }
}
