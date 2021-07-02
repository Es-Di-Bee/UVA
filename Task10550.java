import java.util.Scanner;
public class Task10550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int num4 = sc.nextInt();
            int turn1, turn2, turn3;
            
            if (num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0) {
                break;
            } 
            if (num2 > num1) {
                turn1 = 360 - ( (Math.abs(num2-num1)) *  9 );
            } else {
                turn1 = ( (Math.abs(num2-num1)) *  9 );
            }
            if (num2 > num3) {
                turn2 = 360 - ( (Math.abs(num2-num3)) *  9 );
            } else {
                 turn2 = ( (Math.abs(num2-num3)) *  9 );
            }
            if (num4 > num3) {
                turn3 = 360 - ( (Math.abs(num3-num4)) *  9 );
            } else {
                  turn3 = ( (Math.abs(num3-num4)) *  9 );  
            }
            int sum = 1080 + turn1 + turn2 + turn3;
            System.out.println(sum);
        }
    }
}
            