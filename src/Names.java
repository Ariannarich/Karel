import java.util.Scanner;

public class
Names {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name here");
    String first = input.next();
        System.out.println("Enter last name here");
        String last = input.next();
        int tot= first.length() + last.length();
         String f= first.substring(0,1);
        String l= last.substring(0,1);
        int half = first.length() /2;
        int half2 = last.length() / 2;
        System.out.println(first+"  " + last);
        System.out.println(tot);
        System.out.println(f+l);
        System.out.println(first.compareTo(last));
        System.out.println(last.lastIndexOf(first));
        System.out.println(first.lastIndexOf(last));
        System.out.print(first.substring(0,half) + last.substring(half2));
        System.out.println("  " + last.substring(0,half2) + first.substring(half));






    }
}