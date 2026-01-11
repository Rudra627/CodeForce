import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        long n = ob.nextLong();
        long m = ob.nextLong();
        long a = ob.nextLong();

        long tiles_n = (n + a - 1) / a;
        long tiles_m = (m + a - 1) / a;

        long result = tiles_n * tiles_m;

        System.out.println(result);
    }
}
