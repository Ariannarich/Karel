import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Width: ");
     int w = input.nextInt();
        System.out.print("Height: ");
   int h = input.nextInt();
        System.out.print("X: ");
       int x = input.nextInt();
        System.out.print("Y: ");
      int y = input.nextInt();
        Rectangle rec = new Rectangle(x,y,h,w);
   w = (int) rec.getWidth(); // Here were the getHeight and Width programs.
   h = (int) rec.getHeight();


   System.out.println("Perimeter =  " + (2 * w + 2 * h)); // here is where i used it for the perimeter
   rec.setRect(x - 4, y + 2, w, h);
    x = (int) rec.getX();
    y = (int) rec.getY();
        System.out.print("New location is: ");
        System.out.print("(");
        System.out.print(x);
        System.out.print(",");
        System.out.print(y);
        System.out.print(") ");






    }
}