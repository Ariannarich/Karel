import java.awt.*;
import java.awt.geom.Rectangle2D;

public class FourRectanglePrinter
{
        public static void main(String[] args) {

            double x= 0;
            double y= 0;
            double w = 2;
            double h= 2;

            Rectangle2D box = new Rectangle();

    box.setRect(x, y, w,h);


    Rectangle2D box2 = new Rectangle();
            box2.setRect(x + 2, y + 2, w, h);
            Rectangle2D box3 = new Rectangle();
            box3.setRect(x += 2, y-=2, w, h );
            Rectangle2D box4 = new Rectangle();
            box4.setRect(x, y, w, h );
            System.out.println(box);
            System.out.println(box2);
            System.out.println(box3);
            System.out.println(box4);






        }

        }
