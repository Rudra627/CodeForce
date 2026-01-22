import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        boolean isHard=false;
        for(int i=1;i<=n;i++){
            int x=ob.nextInt();
            if(x==1){
                isHard=true;
                break;
            }
        }
        if(isHard){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }

    }
}
