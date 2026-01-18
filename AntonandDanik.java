import java.util.*;
public class AntonandDanik {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        String str=ob.next();
        int coa,cod;
        coa=cod=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A'){
                coa++;
            }
            else if(ch=='D'){
                cod++;
            }
        }
        if(coa>cod){
            System.out.println("Anton");
        }
        else if(cod>coa){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
