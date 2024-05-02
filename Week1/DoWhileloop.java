import java.util.Scanner;

public class DoWhileloop {
    public static void main(String[] args) {
        /*while loop checks thee expression first  */
        int num1 = 0;
        while(num1<0){
            System.out.println("this will not execute ");

        }
        /*do while loop checks the expression after running a loop 
         * which means do while loop runs at least once
         */
        do{
            System.out.println("this will execute");
        }while (num1<0);
        /*although the exp is the same the do while will execute at least once */
        int doCount=0;
        do{
            System.out.println("DO COUNT "+ doCount);
            doCount ++;

        }while (doCount<= 5 );

        /*task 
         * ask user for num until the number provided is negative
         * you can use while or do while to complete this 
         */
        Scanner scan = new Scanner (System.in);
        int input ;
        do{
            System.out.println("Enter a neg number");
            input =scan.nextInt();
        }while(input> 0);
        scan.close();
        }

    }
    
}
