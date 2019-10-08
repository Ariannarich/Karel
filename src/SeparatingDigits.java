import java.util.Scanner;

public class SeparatingDigits
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num2 = quotient(num);
        int num3 = remainder(num2);
    }
    static int quotient(int a ) {
    {
      a = a / 10;
      return a;

   }
    static int remainder(int b) {
    {
       b = b % 10;
       return b;

    }
    public static void main(String[] args) {



    }
}
