import java.util.*;
public class GeorgeandAccommodation {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            int p=ob.nextInt();
            int q=ob.nextInt();
            if(q-p>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
