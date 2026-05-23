
import java.lang.reflect.Array;
import java.util.Arrays;

public class ActivitySelection{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int res[][]=new int[end.length][3];
        for(int i=0;i<end.length;i++){
            res[i][0]=i;
            res[i][1]=start[i];
            res[i][2]=end[i];
        }
        Arrays.sort(matrix, (a, b) -> Integer.compare(a[0], b[0]))
    }
}