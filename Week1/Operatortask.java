package Task.Week1;

public class Operatortask {
    public static void main(String[] args) {
        /*1print whether a variable is greater or equal to 18 */
         int rNum1=20 ;
        System.out.println("Is rNum1 greater or equal to 18 "+ (rNum1>=18));


        /*2 print SI */
        int rAmount=200 , rTime=3 ;
        float rRate = 3.2F;
        System.out.println("si"+ ((rAmount*rTime*rRate))/100);

        /*3 area and peri of rec */
        int rLength=10 , rBr=20;
        System.out.println("the area"+((rLength)*rBr));
        System.out.println("perimeter"+( 2 * (rLength +rBr)));


        /*completer task 1 using ternary operation */
        int a =10;
        String output = a>=18 ? " greater  ": "smaller  ";
        System.out.println(output);






    }
    
}
