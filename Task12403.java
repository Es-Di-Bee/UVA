import java.util.Scanner;
public class Task12403
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        sc.nextLine();
        int sum = 0;
        for (int i = 1; i <= t; ++i) {
            String str = sc.nextLine();
            if (str.charAt(0) == 'd') {
                String[] parts = str.split(" ");
                String part1 = parts[0];
                String part2 = parts[1];
                int tk = Integer.parseInt(part2);
                sum += tk;
            } else if (str.charAt(0) == 'r') {
                System.out.println(sum);
            }
        }
    }
}
