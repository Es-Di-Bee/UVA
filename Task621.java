import java.util.Scanner;
public class Task621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; ++i) {
            String str = sc.nextLine();
            if (str.equals("1") || str.equals("4") || str.equals("78")) {
                System.out.println('+');
            } else if (str.charAt(str.length() - 1) == '5') {
                System.out.println('-'); 
            } else if (str.charAt(0) == '9') { 
                System.out.println('*');
            } else {
                System.out.println('?');
            }
        }
    }
}
                   
   