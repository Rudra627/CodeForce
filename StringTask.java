import java.util.Scanner;
public class StringTask {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str=ob.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
               ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='Y' || ch=='y'){
                continue;
               }
               else{
                ch=Character.toLowerCase(ch);
                    result.append(".");
                    result.append(ch);
               }
               
                   }
                   System.out.println(result);
}
}
