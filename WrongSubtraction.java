import java.util.*;
public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int k=ob.nextInt();
        int i=0;
        while(n>0 && i!=k){
            if(n%10!=0){
                n--;
            }
            else{
                n/=10;
            }
            i++;
        }
        System.out.println(n);
    }
}
