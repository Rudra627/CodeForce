import java.util.Scanner;
public class Perfect{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=obj.nextInt();
        for(int i=1;i<=num;i++){
            int x=obj.nextInt();
            for(int j=1;j<x;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}