import java.util.Scanner;
public class Task11044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int beams = (n / 3) * (m / 3);
            System.out.println(beams);
        }
    }
}
            