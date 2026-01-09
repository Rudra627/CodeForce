import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int n1=ob.nextInt();
            int n2=ob.nextInt();
            int n3=ob.nextInt();
            if(n1+n2+n3>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
