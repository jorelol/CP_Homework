package Shapes;

/**
 * Created by jorel on 5/4/17.
 */
public abstract class Shape {

    protected double parA;
    protected double parB;

    public Shape(double parA, double parB){
        setParams(parA, parB);
    }


    public void setParams(double parA, double parB){
        this.parA = parA;
        this.parB = parB;

    }

    public abstract double calculateSurface();

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+"{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
