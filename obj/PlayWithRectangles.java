package obj;

import java.awt.*;

/**
 * Created by jorel on 5/4/17.
 */
public class PlayWithRectangles {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(45,24);
        r1.setParams(45,24);
        double surface = r1.calculateSurface();
        System.out.println(surface);

        Rectangle r2 = new Rectangle(32,4);
        r2.setParams(32,4);
        System.out.println(r2.calculateSurface());


    }
}
