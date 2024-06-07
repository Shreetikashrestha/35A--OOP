import java.util.Scanner;

public class Funcmulti {
    public static int multplyTwo(int x , int y ){
    int multiply = x*y;
    return multiply;
}

public static void main(String[] args) {
    Scanner n = new Scanner(System.in);

    System.out.println("enter the value of x ");
    int x = n.nextInt();

    System.out.println("enter the value of y ");
    int y = n.nextInt();

    int multiply=multplyTwo(x, y);
    System.out.println("the multiple is "+multiply);


}
}
