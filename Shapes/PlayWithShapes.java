package Shapes;

/**
 * Created by jorel on 5/4/17.
 */
public class PlayWithShapes {

    public static void main(String[] args) {
        Shape sh1 = new Shape(45, 45) {
            @Override
            public double calculateSurface() {
                return 0;
            }
        };
        System.out.println(sh1);

        Rectangle r1 = new Rectangle(21,13);
        System.out.println(r1.calculateSurface());

        Circle c1 = new Circle(5);
        System.out.println(c1.calculateSurface());

    }
}
