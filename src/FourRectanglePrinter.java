import java.awt.*;
import java.awt.geom.Rectangle2D;

public class FourRectanglePrinter
{
        public static void main(String[] args) {

            double x= 0;
            double y= 0;
            double w = 2;
            double h= -2;

            Rectangle box = new Rectangle();

    box.setRect(x, y, w,h);



            box.translate(0,0);
            System.out.println(box);
            box.translate(2,0);
            System.out.println(box);
            box.translate(-2,-2);
            System.out.println(box);
            box.translate(2,0);
            System.out.println(box);








        }

        }
