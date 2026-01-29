import java.util.*;
public class ArrivaloftheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        int maxIndex=0;
        int minIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                maxIndex=i;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==min){
                minIndex=i;
                break;
            }
        }
        int moves=maxIndex+((n-1)-minIndex);
        if(maxIndex>minIndex){
            moves--;
        }
        System.out.println(moves);
    }
}
