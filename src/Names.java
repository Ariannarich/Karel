import java.util.Scanner;

public class Names {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    String first = input.next();
        String last = input.next();
        int tot= first.length() + last.length();
        int f = first.indexOf(0);
        System.out.println(tot);
        System.out.println(f);




    }
}