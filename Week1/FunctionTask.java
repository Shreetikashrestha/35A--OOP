import java.util.Scanner;

public class FunctionTask {
 public static int calculatingSum(int a , int b ){
    int sum = a+b ;
    return sum;
 }




 
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("enter the value of a ");
        int a = n.nextInt();

       
        System.out.println("enter the value of b");
        int b = n.nextInt();

        int sum =calculatingSum(a,b);
       
        System.out.println("sum of 2 number is "+ sum );
       
       
    



        
    }
       
    }
    
    

