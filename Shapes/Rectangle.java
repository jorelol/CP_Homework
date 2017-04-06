package Shapes;

/**
 * Created by jorel on 5/4/17.
 */
public class Rectangle extends Shape {

    public Rectangle(double parA, double parB){
        super(parA, parB);
    }

    public double calculateSurface() {
        return parA*parB;
    }
}
