import java.util.Scanner;

public class FindThePower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base:");
        double base = input.nextDouble();
        System.out.println("Enter the exponent:");
        double exponent = input.nextDouble();
        double answer = Math.pow(base, exponent);
        System.out.println((int)base + " ^ " + (int)exponent + " = " + answer);

    }
}
