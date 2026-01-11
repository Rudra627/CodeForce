
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int k=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int count=0;
        for(int num:arr){
            if(num>0 && num>=arr[k-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
