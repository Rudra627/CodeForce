import java.util.*;
public class Pangram {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next().toLowerCase();
        boolean[] present=new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){
                present[ch-'a']=true;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(present[i]){
                count++;
            }
        }
        if(count==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
