
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();
        int lc=0,uc=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                lc++;
               }
               else if(ch>='A' && ch<='Z'){
                uc++;
               }
        }
        if(lc<uc){
            str=str.toUpperCase();
        }
        else if(lc>uc || lc==uc){
            str=str.toLowerCase();
        }
        System.out.println(str);
    }
}
