import java.util.*;
public class Bit {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            String str=ob.next();
            if(str.contains("++")){
                x++;
            }
            else if(str.contains("--")){
                x--;
            }
        }
        System.out.println(x);
    }
}
