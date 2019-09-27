import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class PointsAndRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x coordinate: ");
        int x = input.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y = input.nextInt();
        Point a = new Point(x, y);
 System.out.print("Enter the width: ");
 int w = input.nextInt();
        System.out.print("Enter the length: ");
        int l = input.nextInt();
         Dimension b = new Dimension(w,l);
         Rectangle2D rec = new Rectangle();
       rec.setFrame(a,b);
       System.out.println(a);
        System.out.println(b);
        System.out.print(rec);

    }

}