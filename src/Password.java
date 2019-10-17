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
        int ml = last.length() /2;
 String beg= first.substring(fm,fm+1) + middle.substring(mm,mm+1)  + last.substring(ml,ml+1);
int f = first.length() - 1;
int m = middle.length() - 1;
int l = last.length() - 1;
String ll = last.substring(l) +middle.substring(m) + first.substring(f);

        int newAge = age * 75;
  String age2 = String.valueOf(newAge);

         beg= beg.toUpperCase();
        String pass =beg.concat(ll).concat(age2);



                System.out.println("Password");
        System.out.print(pass);


    }




}
