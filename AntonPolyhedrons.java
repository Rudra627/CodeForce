import java.util.Scanner;

public class AntonPolyhedrons {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int sum=0;
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=ob.next();
            if(str[i].equals("Tetrahedron")){
                sum+=4;
            }
            else if(str[i].equals("Cube")){
                sum+=6;
            }
            else if(str[i].equals("Octahedron")){
                sum+=8;
            }
            else if(str[i].equals("Dodecahedron")){
                sum+=12;
            }
            else if(str[i].equals("Icosahedron")){
                sum+=20;
            }
        }
        System.out.println(sum);
    }
}
