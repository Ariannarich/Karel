import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name here");
        String first = input.next();
        System.out.println("Enter middle name here");
        String middle = input.next();
        System.out.println("Enter last name here");
        String last = input.next();
        System.out.println("Enter age here");
        int age = input.nextInt();
        int fm = first.length() /2;
        int mm = middle.length() /2;
        int lm = last.length() /2;
 int mid= fm +mm +lm;
 int las = first.lastIndexOf(first) + middle.lastIndexOf(middle) + middle.lastIndexOf(middle);
  int newAge = age * 75;


        System.out.println("Password");
        System.out.print(first.substring(fm)        System.out.print(las+ newAge);

    }




}
