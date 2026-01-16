import java.util.*;
public class Football {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
         String str=ob.nextLine();
        int j=0;
        int maxco=0;
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.charAt(j)!=ch){
                j=i;
            }
            else{
                maxco=Math.max(maxco,i-j+1);
            }

         }
        if(maxco>=7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
