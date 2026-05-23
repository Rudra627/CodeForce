import java.util.*;
class Index{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int co=0;
        int ps=0;
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==1){
                co++;
            }
            if(b==1){
                co++;
            }
            if(c==1){
                co++;
            }
            if(co>=2){
                ps++;
            }
        }
        System.out.println(ps);
    }
}