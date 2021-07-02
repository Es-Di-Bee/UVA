import java.util.Scanner;
public class Task12279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int i = 0;
            for (int j = 1; j <= n; ++j) {
                int k = sc.nextInt();
                if (k == 0) {
                    i++;
                }
            }
                int y = (n - i) - i;
                System.out.println("Case " + count + ": " + y);
                count++;
        }
    }
}