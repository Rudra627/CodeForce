
import java.util.*;
public class Tram {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int total_sum=0,maxsum=0;
        for(int i=0;i<n;i++){
            int a=ob.nextInt();
            total_sum-=a;
            int b=ob.nextInt();
            total_sum+=b;
            maxsum=Math.max(total_sum,maxsum);
        }
        System.out.println(maxsum);
    }
}
