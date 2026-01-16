import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        String n=ob.nextLine();
        int co=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch=='4'||ch=='7'){
                co++;
            }
        }
        boolean isNearlyLucky=true;
        if(co==0){
            isNearlyLucky=false;
        }else{
            while(co>0){
                int digit=co%10;
                if(digit!=4 && digit!=7){
                    isNearlyLucky=false;
                    break;
                }
                co/=10;
            }
        }
        if(isNearlyLucky){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
