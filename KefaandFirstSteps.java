import java.util.*;
public class KefaandFirstSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int count=0;
        int max=1;
        for(int num:arr){
            if(num>=arr[i]){
                count++;
            }
            else{
                count=1;
                 i++;
            }
           
            if(count>max){
                max=count;
            }
            
        }
        System.out.println(max);
}
}
