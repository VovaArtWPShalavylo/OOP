import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double Des;
        Des = b * b - 4 * a * c;

        double D = Math.sqrt(Des);
        if ((a == 0) & (b != 0)) {
            if (c == 0) {
                double x1 = 0.0;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x1);
                return;
            } else if (c != 0) {
                double x1 = -(c / b);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x1);
                return;
            }
            return;

        }
        if (Des >= 0) {
            double x1 = (-b + D) / (2 * a);
            double x2 = (-b - D) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("x1 = ");
            System.out.println("x2 = ");
            return;
        }
        if (((a == 0) & (b == 0) & (c == 0)) | (a == 0) & (b == 0)) {
            System.out.println("x1 = ");
            System.out.println("x2 = ");
            return;
        }

    }
}