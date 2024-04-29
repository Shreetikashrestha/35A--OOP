package Task.Week1;
import java.util.Scanner;
public class InputOutout {
    public static void main(String[] args) {
        /*system.out.print ln
         * sout
         */
        System.out.println("This line breaks");
        /*system.ot.print  */ 
        System.out.print("this will not break");
        System.out.print("this will continue\n");
        System.out.print("this will continue\n");

        /*System.out.printf()
         * %s string ,%d integer , %f floating point  , %b boolean 
         */
        System.out.printf("hello %s ,Good Morning\n ", "World" );
        System.out.printf("this is a num % d",10);
        /*multi format  */
        System.out.printf("both float %f and %b",10.3f ,false);

/*input lina ko lagi scanner */
        // Scanner scan = new Scanner(System.in );
        // System.out.println("the following takes sentences");
        // String stringInput = scan.nextLine();
        // System.out.println("the following takes int");
        // int intInput =scan.nextInt();
        // System.out.println("the following takes boolean");
        // boolean boolInput= scan.nextBoolean();
        // scan.close();


        // Scanner scan1 =new Scanner(System.in);
        // System.out.println("task 1");
        // System.out.println("What is your name ? ");
        // String name=scan1.nextLine();
        // System.out.println("Over 18?");
        // boolean status= scan1.nextBoolean();
        // System.out.println("how many siblings?");
        // int sibling =scan1.nextInt();
        // System.out.printf("hello %s",name);
        // System.out.printf("Status? %b",status);
        // System.out.printf("you have %d no. of sibling",sibling);

        // scan1.close();

        Scanner scan2= new Scanner(System.in);
        System.out.println("task1 reepeat for practice with variation");
        System.out.println("what is ur address");
        String address= scan2.nextLine();
        System.out.println("enter ur age");
        int age = scan2.nextInt();
        System.out.println("r u single ?");
        boolean stat = scan2.nextBoolean();
        System.out.printf("u reside in %s",address);
        System.out.printf("ur age is %d",age);
        System.out.printf("ur marriage status is %b and ur marks is %f",stat,2.3);
        scan2.close();





    }
    
}
