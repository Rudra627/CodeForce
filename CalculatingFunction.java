import java.util.*;
public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
            else{
                sum-=i;
            }
        }
        System.out.println(sum);
    }
}
