/**
 * Created by jorel on 22/3/17.
 */
public class Prime {
    public static void main(String[] args) {

        int prime = 0;
        int n = 5;
        String primenumbers = "";

        for(int i=1;i<=n;i++){
            int count = 0;
            for(prime=i;prime>=1;prime--){
                if(i%prime==0){
                    count = count + 1;
                }
            }
            if (count==2){
                primenumbers=primenumbers+i+" ";
            }
        }
        System.out.println(primenumbers);
    }
}
