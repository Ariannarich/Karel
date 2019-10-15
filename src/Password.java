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
String mid = first.substring(fm,fm+1) + middle.substring(mm,mm+1) + last.substring(lm, lm+1);
 int lasf = first.lastIndexOf(first);
int lasm = middle.lastIndexOf(middle);
 int lasl = last.lastIndexOf(last);
 String laslet =  first.substring(lasf-1,lasf) + middle.substring(lasm) + last.substring(lasl);
  int newAge = age * 75;


        System.out.println("Password");
        System.out.print(mid.toUpperCase());
      System.out.println(laslet);
        System.out.print(newAge);

    }




}
