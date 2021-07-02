import java.util.Scanner;
public class Task12289 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; ++i) {
            String str = sc.nextLine();
            if (str.length() == 5) {
                System.out.println(3);
            } else {
                if ( (str.charAt(0)=='o' && str.charAt(1)=='n') 
                        || (str.charAt(0)=='o' && str.charAt(2)=='e')
                        || (str.charAt(1)=='n' && str.charAt(2)=='e') ) 
                {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
    }
}
                    