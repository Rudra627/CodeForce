
import java.util.Scanner;

public class Chatroom {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();
        int j=0;
        String target="hello";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(j<target.length() && ch==target.charAt(j)){
                j++;
            }
           
        }
        if(j == target.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
