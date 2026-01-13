import java.util.*;
public class HelpfulMaths {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split("\\+");
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr1);
        String res="";
        for(int i=0;i<arr1.length;i++){
            res+=String.valueOf(arr1[i]);
            if(i<arr1.length-1){
                res+="+";
            }
        }
        System.out.println(res);
    }
}
