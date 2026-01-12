import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str1 = ob.nextLine();
        String str2=ob.nextLine();
        if(str1.length()!=str2.length()){
            return;
        }
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(0);
            return;
        }
        for (int i = 0; i <str1.length(); i++) {
            char ch1 = Character.toLowerCase(str1.charAt(i));
            char ch2=Character.toLowerCase(str2.charAt(i));
            if(ch1<ch2){
                System.out.println(-1);
                return;
            }
            else if(ch1>ch2){
                System.out.println(1);
                return;
        }
    }
}
}
