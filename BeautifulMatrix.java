import java.util.Scanner;

public class BeautifulMatrix{
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        Scanner ob = new Scanner(System.in);
        int row = 0, col = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = ob.nextInt();
                if(arr[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }

        int move = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.println(move);
    }
}
