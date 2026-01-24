import java.util.*;
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        while(n>0){
            n=n%4;
            n=n%7;
        }
        if(n==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
