
import java.util.Scanner;

public class Translation {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        String str1=ob.nextLine();
        String str=ob.nextLine();
        StringBuilder str2=new StringBuilder(str);
        str2.reverse(); 
        if(str1.equals(str2.toString())){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        

    }
}
