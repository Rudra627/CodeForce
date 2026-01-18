
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int year=ob.nextInt();
        while(true){
            year++;
            String yr=Integer.toString(year);
            boolean flag=true;
            for(int i=0;i<yr.length();i++){
                for(int j=i+1;j<yr.length();j++){
                    if(yr.charAt(i)==yr.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(flag){
                System.out.println(year);
                break;
            }
        }
    }
}
