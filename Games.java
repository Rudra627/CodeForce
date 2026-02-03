import java.util.*;
public class Games {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a[]=new int[n];
        int h[]=new int[n];
        for (int i =0;i<n; i++) {
            h[i]=ob.nextInt();
            a[i]=ob.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(h[i]==a[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    
    }
}
