import java.util.*;
public class EvenOdds {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        long n=ob.nextLong();
        long k=ob.nextLong();   
        long odd=(n+1)/2;
        if(k<=odd){
            System.out.println(2*k-1);
        }
        else{
            System.out.println(2*(k-odd));
        }
    }
}
