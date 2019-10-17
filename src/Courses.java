import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String title = input.next();
        int titleLength = title.indexOf(title);
        char space1 = ' ';
        int department = title.indexOf(space1, 1);
        System.out.println(title.substring(department));


    }
}
