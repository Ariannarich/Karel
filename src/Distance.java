import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the first point:");
        int x1 = input.nextInt();
        System.out.println("Enter the y coordinate of the first point:");
        int y1 = input.nextInt();
        System.out.println("Enter the x coordinate of the second point:");
        int x2 = input.nextInt();
        System.out.println("Enter the y coordinate of the second point:");
        int y2 = input.nextInt();

       int xDiff = Math.subtractExact(x2,x1);
       int yDiff = Math.subtractExact(y2,y1);
       double xSquare = Math.pow(xDiff,2);
        double ySquare = Math.pow(yDiff,2);
      int sum = Math.addExact((int)xSquare,(int)ySquare);
       double distance = Math.sqrt(sum);
        System.out.println("The distance between (" + x1 + "," + y1 +") and (" + x2 + "," + y2 + ") is " + distance);


    }
}
