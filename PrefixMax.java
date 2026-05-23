import java.util.Scanner;
public class PrefixMax {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();
        for(int i=0;i<t;i++){
            int n=ob.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=ob.nextInt();
            }
            int idx=0;
            int max=arr[0];
            for(int j=1;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];
                    idx=j;
                }
            }
            int temp=arr[idx];
            arr[idx]=arr[0];
            arr[0]=temp;
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
