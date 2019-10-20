import java.util.Scanner;

public class TemperatureDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter first temperature here");
        int temp1 = input.nextInt();
        System.out.println("Enter second temperature here");
        int temp2 = input.nextInt();
        int newTemp = Math.abs(temp1-temp2);
        System.out.println("The temperature changed " + newTemp +" degrees");
    }
}
