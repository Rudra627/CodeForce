import java.util.*;
public class HQ9 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String code=ob.nextLine();
        if(code.contains("H") || code.contains("Q") || code.contains("9")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
