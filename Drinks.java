import java.util.*;
public class Drinks {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            int p=ob.nextInt();
            sum+=p;
        }
        double res=sum/n;
        System.out.println(res);
    }
}
