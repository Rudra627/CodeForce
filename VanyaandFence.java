
import java.util.Scanner;

public class VanyaandFence {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int h=ob.nextInt();
        int w=0;
        for(int i=0;i<n;i++){
            int a=ob.nextInt();
            if(a>h){
                w+=2;
            }
            else{
                w+=1;
            }
        }
        System.out.println(w);
    }
}
