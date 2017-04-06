package Shapes;

/**
 * Created by jorel on 5/4/17.
 */
public class Square extends Shape {
    public Square(double parA) {
        super(parA, 0);
    }

    @Override
    public double calculateSurface() {
        return Math.pow(parA,2);
    }
}
