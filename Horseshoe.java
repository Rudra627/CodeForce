import java.lang.*;
import java.util.*;
public class Horseshoe{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=ob.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        for(int i=1;i<4;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println(3-j);

    }
}