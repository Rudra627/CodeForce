import java.util.*;
public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        long n=ob.nextLong();
        if(n%2==0){
            System.out.println(n/2);
        }
        else{
            System.out.println(-((n + 1)/2));
        }
    }
}
