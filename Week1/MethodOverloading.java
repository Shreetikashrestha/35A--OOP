public class MethodOverloading {
    public static void main(String[] args) {
        MathOperation o = new MathOperation();
    // if we want addition of two int 
    System.out.println(o.add(10,20));
    //if we want the addition of 3 int 
    System.out.println(o.add(10,20,30));
    //if we want the addition of 2 double 
    System.out.println(o.add(10.2,11.6));
    
        System.out.println(o.subtraction(12, 2));
        System.out.println(o.subtraction(1.0,2.0,3.3));
        System.out.println(o.subtraction(1, 05, 2.0));
        o.subtraction(2);
        o.subtraction(2.0);
    }
    

    
}
class MathOperation{
    int add (int num1 , int num2 ){
        return num1 +num2 ;
    }

//method overloading 
// 1. same func with diff in num of parameter 
int add (int num1 , int num2 , int num3){
    return num1 +num2+num3 ;
}
//2 same func with difference in data type 
double add (double num1 , double num2 ){
    return num1 +num2 ;
}
double add (double num1 , int num2){
    return num1+num2 ;
}
//illegal operation 
// 1.overloading looks for the parameter data type not the variable name 
// cannot make the func :int add(int a , int b )
// 2.overloading looks for only the change of parameter not the return type 
// cannot make the func : double add(int num1 ,int num2 )


//task 
//make a func subtraction 
//take two int and return int 
// take three double and return double 
//take 1 double and print invalid operation
// take 1 int and print invalid operation 
// take 2 int and double and return double 
// call these func from MathOperation object

int subtraction(int num1 , int num2 ){
    return num1 -num2;

}
double subtraction(double num1 , double num2, double num3 ){
    return num1 -num2-num3;


}
void  subtraction(double num1 ){
    System.out.println("invalid operation");


}
void subtraction(int num1 ){
    System.out.println("invalid operation");


}
double subtraction(int num1 , int num2 ,double num3){
    return num3-num2 -num1;
}
}
