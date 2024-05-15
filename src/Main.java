import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Vychisleniya {
    public double x;
    public double a;
    public double b;

    Vychisleniya(double x, double a, double b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }

    public int calculate1(double x) {
        return (int) (3 * x + 5);
    }

    public double calculate2(double a, double b) {
        if ((a-b) == 0) {
            return 0;
        }
        else {
            return (a + b) / (a - b);

        }
    }

    public int calculate3(double a, double x, double b) {
        if (b == 0) {
            return 0;
        }
        else {
            double number = (a * x) / b;
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }

    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        Vychisleniya obj = new Vychisleniya(x, a, b);
        System.out.println("3 * x + 5 =" + obj.calculate1(x));
        Vychisleniya obj2 = new Vychisleniya(x, a, b);
        System.out.println("(a + b) / (a - b) =" + obj2.calculate2(a, b));
        Vychisleniya obj3 = new Vychisleniya(x, a, b);
        System.out.println("((a * x) / b)! =" + obj3.calculate3(x, a, b));

    }

}