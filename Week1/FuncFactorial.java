import java.util.Scanner;

public class FuncFactorial {
    public static int findFactorial(int n ){
    int fact= 1;
    for (int i=n;i>=1;i--){
        fact=fact*i;
       
    }
         System.out.println("the factorial is "+fact);
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc .nextInt();

        int fact = findFactorial(n);


    }
}


