import java.util.Scanner;
public class Task11547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = sc.nextInt();
            int result = n * 567;
            result /= 9 ;
            result += 7492;
            result *= 235;
            result /= 47;
            result -= 498;
            n = result / 10;
            int digit = n % 10;
            System.out.println(Math.abs(digit));
        }
    }
}