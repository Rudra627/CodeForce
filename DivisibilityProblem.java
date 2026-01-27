import java.util.*;
public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        int ar[] = new int[t];
        for(int i=0;i<t;i++){
            int a=ob.nextInt();
            int b=ob.nextInt();
            if(a%b==0){
                ar[i]=0;
            }
            else{
            ar[i]=b - (a % b);
        }
        }
        for(int i=0;i<t;i++){
            System.out.println(ar[i]);
        }
    }
}
