
import java.lang.*;
import java.util.*;
public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a=ob.next();
        String b=ob.next();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                result.append('0');
            } else {
                result.append('1');
            }
        }
        System.out.println(result.toString());
    }
}
