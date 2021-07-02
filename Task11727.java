import java.util.Arrays;
import java.util.Scanner;
public class Task11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int[] a = new int[3];
            for (int j = 0; j < 3; ++j) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println("Case " + i + ": " + a[1]);
        }
    }
}