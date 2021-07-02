import java.util.Scanner;
public class Task12250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals("#")) {
                break;
            }
            if (str.equals("HELLO")) {
                System.out.println("Case " + count + ": " + "ENGLISH");
            }
            else if (str.equals("HOLA")) {
                System.out.println("Case " + count + ": " + "SPANISH");
            }
            else if (str.equals("HALLO")) {
                System.out.println("Case " + count + ": " + "GERMAN");
            }
            else if (str.equals("BONJOUR")) {
                System.out.println("Case " + count + ": " + "FRENCH");
            }
            else if (str.equals("CIAO")) {
                System.out.println("Case " + count + ": " + "ITALIAN");
            }
            else if (str.equals("ZDRAVSTVUJTE")) {
                System.out.println("Case " + count + ": " + "RUSSIAN");
            }
            else {
                System.out.println("Case " + count + ": " + "UNKNOWN");
            }
            count++;
        }
    }
}