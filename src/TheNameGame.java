import java.util.Scanner;

public class TheNameGame {
   

        static void ver1(String name) {

        System.out.print(name+", " + name+", ");
           System.out.println("bo-B"+ name.substring(1));
        }
    static String ver2(String name) {
        System.out.println("Banana-fana fo-F" + name.substring(1));
        return name;
    }
    static String ver3(String name) {
        System.out.println("Fee-fi-mo-M" + name.substring(1));
        return name;
    }
        static String ver4(String name) {
            System.out.println(name.toUpperCase() + "!");
            return name;
        }
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             System.out.println("Enter last name here");
             String first = input.next();
             System.out.println("Enter last name here");
             String last = input.next();
             ver1(first);
             ver2(first);
             ver3(first);
             ver4(first); 
             ver1(last);
             ver2(last);
             ver3(last);
             ver4(last);


    }

    }
