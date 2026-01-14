
import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=n/5;
      int b=n%5;
      if(b==0){
      System.out.println(a);
    }
    else{
        System.out.println(a+1);
      }
    }
}
