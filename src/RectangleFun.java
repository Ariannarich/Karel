import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Width: ");
     double w = input.nextInt();
        System.out.print("Height: ");
     double h = input.nextInt();
        System.out.print("X: ");
       double x = input.nextInt();
        System.out.print("Y: ");
      double y = input.nextInt();



  Rectangle2D rec = new Rectangle();
  rec.setRect(x - 4, y + 2, w, h);
   w = rec.getWidth();
   h = rec.getHeight();
   double perimeter = w + h;
   System.out.println("Perimeter =  " + perimeter);
    x = rec.getX();
    y = rec.getY();
        System.out.print("New location is: ");
        System.out.print("(");
        System.out.print(x);
        System.out.print(",");
        System.out.print(y);
        System.out.print(") ");






    }
}