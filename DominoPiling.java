
import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        int maxDominoes=(n*m)/2;
        System.out.println(maxDominoes);
    }
}
