package obj;

/**
 * Created by jorel on 5/4/17.
 */
public class Rectangle {

    protected double sideA; //protected = private but visible to children
    protected double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setParams(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public double calculateSurface() {
        return sideA*this.sideB;
    }
}
