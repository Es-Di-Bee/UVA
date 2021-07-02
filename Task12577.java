import java.util.Scanner;
public class Task12577
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("*")) {
                break;
            } else if (str.equals("Hajj")) {
                System.out.println("Case " + count + ": " + "Hajj-e-Akbar");
            } else if (str.equals("Umrah")) {
                System.out.println("Case " + count + ": " + "Hajj-e-Asghar");
            } count++;
        }
    }
}
            
