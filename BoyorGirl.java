
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str=ob.nextLine();
        int i=0;
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        for(int j=0;j<ch.length;j++){
            if(ch[j]!=ch[i]){
                i++;
                ch[i]=ch[j];
            }
        }
        int uniqueCount=i+1;
        if(uniqueCount%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
