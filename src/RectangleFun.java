import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Width: ");
     int w = input.nextInt();
        System.out.print("Height: ");
     int h = input.nextInt();
        System.out.print("X: ");
       double x = input.nextInt();
        System.out.print("Y: ");
      double y = input.nextInt();
      int perimeter = 2*w + 2+h;

  System.out.println("Perimeter =  " + perimeter);
  Rectangle2D rec = new Rectangle();
  rec.setRect(x - 4, y + 2, w, h);
    x = rec.getX();
    y = rec.getY();
        System.out.print("New location is: ");
        System.out.print(x);
        System.out.print(",");
        System.out.print(y);



    }
}