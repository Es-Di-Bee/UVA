import java.util.Scanner;
public class Task10114 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        while (sc.hasNext()) {
            int months = sc.nextInt();
            if (months < 0) {
                double payment = sc.nextDouble();
                double due = sc.nextDouble();
                int records = sc.nextInt();
                break;
            }
            double downPayment = sc.nextDouble();
            double due = sc.nextDouble();
            double price = downPayment + due;
            double payment = due / months;
            int records = sc.nextInt();
            double[] a = new double[months + 1];
            int[] b = new int[records];
            double[] c = new double[records];
            for (int i = 0; i < b.length; ++i) {
                b[i] = sc.nextInt();
                c[i] = sc.nextDouble();
            }
            for (int j = 0; j < b.length; ++j) {
                for (int i = j; i < a.length; ++i) {
                    if (b[j] == i) {
                        a[i] = c[j];
                        break;
                    }
                }
            }
            double oldPercentage = 0.0;
            int result = 0;
            for (int i = 0; i < a.length; ++i) {
                if (a[i] != 0) {
                    double newPercentage = a[i];
                    price = price - (price * newPercentage);
                    if (i == 0) {
                        oldPercentage = newPercentage;
                        if (due < price) {
                            System.out.println("0 months");
                            result = -1;
                            break;
                        } else {
                            continue;
                        }
                    }
                    due -= payment;
                    oldPercentage = newPercentage;
                } else {
                    price = price - (price * oldPercentage);
                    due -= payment;
                }
                if (due < price) {
                    result = i;
                    break;
                } 
            }
            if (result == 1) {
                System.out.println("1 month");
            } else if (result > 1) {
                System.out.println(result + " months");
            }
        }
    }
}


