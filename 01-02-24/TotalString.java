import java.util.*;

public class TotalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // all a
        int c = 1;

        // one b or c and rest a
        c = c + (2 * n);

        // only b and c
        c = c + n * (n - 1);

        // one b and one c and rest a
        c = c + ((n * (n - 1) * (n - 2)) / 2);

        // 2c and rest a
        c = c + n * (n - 1) / 2;

        System.out.println(c);
        sc.close();

    }

}
