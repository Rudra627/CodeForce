
import java.util.Scanner;

public class IQtest {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a[]=new int[n];
        for (int i =0;i<n; i++) {
            a[i]=ob.nextInt();
        }
        for(int i=1;i<n;i++){
            if(a[i]%a[i-1]!=0){
                System.out.println(a[i]);
                break;
            }
        }
    }
}
