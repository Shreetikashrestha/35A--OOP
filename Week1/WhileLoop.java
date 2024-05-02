
import java.util.Scanner;
    public class WhileLoop {
    public static void main(String[] args) {
        /*while takes condition / boolean expression in () */
        int count = 0;
        while (count <= 5){
            System.out.println("while iteration "+ count );
            ++ count ;
        }
        /* use while when you donot know the number of iteration
         * for eg use while to ask user for specific number until
         * the condition is satisfied
         */

         Scanner scan = new Scanner ( System.in );
         System.out.println("please enter a number");
         int intInput =scan.nextInt();
         while (intInput < 0 || intInput> 100){
            System.out.println("please enetr a num between 0 - 100");
            intInput =scan.nextInt();

         }
         System.out.println("condition 0 -100 number "+intInput);
         scan.close();



    }
    
}
