import java.util.*;
public class Magnets {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int group_count=1;
        String prev=ob.next();
        for(int i=1;i<n;i++){
            String str=ob.next();
            if(!str.equals(prev)){
                group_count++;
            }
            prev=str;
        }
        System.out.println(group_count);
    }
}
