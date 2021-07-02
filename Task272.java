import java.util.Scanner;
public class Task272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '\"') {  
                    if (c %2 != 0) {
                        System.out.print("``");
                    } else {
                        System.out.print("''");
                    }
                    c++;
                    continue;
                }
                System.out.print(line.charAt(i));
            }
            System.out.println();
        }
    }
}