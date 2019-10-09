import java.util.Scanner;

public class SeparatingDigits
{
   public static int quotient(int a ) {
        a /= 10;
        return a;
    }
    public static int remainder(int b) {
         b %= 10;
            return b;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num2 = quotient(num);
        int dig3 = remainder(num2);
        int num3 =quotient(num2);
        int dig2 = remainder(num3);
        int num4 =quotient(num3);
        int dig1 = remainder(num4);
        int dig4 = remainder(num);
        System.out.println(  dig1 +  "  "+ dig2 + "  " + dig3 + "  " + dig4);

    }
    }







