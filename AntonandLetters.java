import java.util.*;
public class AntonandLetters {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                set.add(ch);
            }
        }
        System.out.println(set.size());
    }
}
