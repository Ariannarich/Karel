import java.util.Scanner;

public class Courses {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Course Description:");
        String title = input.nextLine();

       int space1 = title.indexOf(" ");
       String course = title.substring(0,space1);

        int space2 = title.indexOf(" ", space1 +1 );

        String num = title.substring(space1 + 1, space2);
String fullTitle = title.substring(space2+1);
        System.out.println("Department:");
     System.out.println(course);
        System.out.println("Course Number:");
        System.out.println(num);
        System.out.println("Title:");
        System.out.println(fullTitle);







    }


    }

