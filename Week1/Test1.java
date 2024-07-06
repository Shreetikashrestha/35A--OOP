import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // Scanner s = new Scanner (System.in);
        // System.out.println("enter the length");
        // int a = s.nextInt();
        // System.out.println("enter the breadth");
        // int b = s.nextInt();

        // int peri = 2*(a+b);
        // System.out.println(peri);



//         Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
// Miles    Kilometers
// 1    1.609
// 2    3.218
// …    ….
// 9    14.481
// 10    16.090
        for (int miles =1 ;miles<11;miles++){
            double kilometers = miles * 1.609;
            System.out.println("miles "+miles + "kilometers"+kilometers);

        
        // }
     
        }
    }
}