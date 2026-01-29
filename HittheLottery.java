import java.util.*;
public class HittheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] denominations = {100, 20, 10, 5, 1};
        for (int d: denominations) {
            count += n / d;
            n = n % d;
        }
        System.out.println(count);
    }
}
