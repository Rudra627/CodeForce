import java.util.*;
public class Expression {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
        int ans=0;
        ans=Math.max(ans,a+b+c);
        ans=Math.max(ans,a*b*c);
        ans=Math.max(ans,(a+b)*c);
        ans=Math.max(ans,a*(b+c));
        ans=Math.max(ans,a+b*c);
        ans=Math.max(ans,a*b+c);

    System.out.println(ans);
}
}