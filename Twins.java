import java.util.*;
public class Twins{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int arr1[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr1[i]=ob.nextInt();
            sum+=arr1[i];
        }

        Arrays.sort(arr1);
        int count=0;
        int curr_sum=0;
        for(int i=n-1;i>=0;i--){
            curr_sum+=arr1[i];
            count++;
            if(curr_sum>sum-curr_sum){
                break;
            }
        }
        System.out.println(count);
    }
}