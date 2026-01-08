import java.util.*;

public class Two{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();  
        while (n-- > 0) {
            String str = ob.next();

            if (str.length() > 10) {
                String newstr = "" + str.charAt(0)
                                + (str.length() - 2)
                                + str.charAt(str.length() - 1);
                System.out.println(newstr);
            } else {
                System.out.println(str);
            }
        }
    }
}
