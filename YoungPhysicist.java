import java.util.*;
public class YoungPhysicist {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int sumx=0,sumy=0,sumz=0;
        for(int i=1;i<=n;i++){
            int x=ob.nextInt();
            int y=ob.nextInt();
            int z=ob.nextInt();
            sumx+=x;
            sumy+=y;
            sumz+=z;
        }
        if(sumx==0 && sumy==0 && sumz==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
