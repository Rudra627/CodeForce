import java.util.*;
class FractionalKnapasac{
    public static void main(String[] args) {
        int p[]={};
        int w[]={};
        int wi=20;

        int rat[][]=new int[p.length][2];
        for(int i=0;i<p.length;i++){
            rat[i][0]=p[i]/w[i];
            rat[i][1]=i;
        }
        Arrays.sort(rat,Comparator.comparingInt(a -> a[0]));
        int finalProfit=0;
        for(int i=rat.length-1;i>=0;i--){
            int idx=rat[i][1];
            if(wi>=w[idx]){
                finalProfit+=p[idx];
                wi-=w[idx];
            }
            else{
                finalProfit+=rat[i][0]*wi;
                wi=0;
                break;
            }
        }
        System.out.println(finalProfit);
    }
}