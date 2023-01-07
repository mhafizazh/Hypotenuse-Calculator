import java.util.Scanner;
public class HypotenuseCalculator {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of x: ");
        x = scanner.nextDouble();
        System.out.println("Enter value of y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotanus is " + z);



    }
}

