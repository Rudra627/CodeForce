import java.util.*;
public class Hulk {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        StringBuffer res=new StringBuffer("I hate ");
        for (int i = 2; i <=n; i++) {
            if(i%2==0){
                res.append("that I love ");
            }
            else{
                res.append("that I hate ");
            }
        }
        res.append("it");
        System.out.println(res.toString());
    }
}
