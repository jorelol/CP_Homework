import java.text.DecimalFormat;

/**
 * Created by jorel on 22/3/17.
 */
public class SumArrElem {

    static Double sumArray (Double[] arr){
        double result = 0; //declare a variable to represent the result
        for(int i=0;i<arr.length;i++){ //create a loop to process the computation
            result += arr[i];
        }
        return result; //function output

    }



    public static void main(String[] args) {

        Double[] arDb = new Double[] {
                45.54, 53.23, 24.34
        };
        Double sum = sumArray(arDb);
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println(df.format(sum));
    }
}
