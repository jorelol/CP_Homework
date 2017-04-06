package Shapes;

/**
 * Created by jorel on 5/4/17.
 */
public class Circle extends Shape{

    public Circle(double parA){
        super(parA, 0);

    }

    public double calculateSurface(){
        return Math.PI*parA*parA; //Math.pow(parA,2)*Math.PI

    }


}
