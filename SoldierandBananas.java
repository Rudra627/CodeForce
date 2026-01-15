import java.util.*;
public class SoldierandBananas {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
         int k=ob.nextInt();
         int n=ob.nextInt();
         int w=ob.nextInt();
         int sum=0;
         for(int i=1;i<=w;i++){
            sum+=k*i;
         }
            if(sum>n){
                System.out.println(sum-n);
            }
            else{
                System.out.println(0);
            }
    }
}
