import java.util.*;
public class Presents {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            int x= ob.nextInt();
            arr2[x-1]=i+1; 
        }
        for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
    }
}
