public class Polymorphism {

    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.makeShape();
        Oval o1 = new Oval();
        o1.makeShape();


        Student s = new Student();
        s.information();
        s.information(19.5);
        s.information("shree", "shrestha");

        
    }
    
}

//polymorphism , same func different behavior
class Shape {
    void makeShape (){
        System.out.println("making shape ");
    }
}

// 1. polymorphism with method overriding 
// make the same fuhnc of parent in child 
// with different behavior/logic

class Oval extends Shape{
    @Override
    void makeShape(){
        System.out.println("making oval");
    }
    //to override the func should be same 
}

//note ; method overriding can only be done using inheritence 

//method overloading 

//2. polymorphism with method overloading 
// making the same func with different in parameters 

class Student {
    void information (){
        System.out.println("student info without params");
    }
    void information(int age ){

        System.out.println("student's age is "+age );
    }
    void information(String firstName , String lastName ){
        System.out.println(firstName +" "+ lastName);
    }
    //method overrloading only see the difference in parameter 
    // not in return type
    // meaning i cannot make another function :float information()
    String information (double age ){
        return "Student age as double is "+age ;
    }
}
//parameter diff can be , change of data type and number of parameter 
// note : func with same params but different varaiable name is not allowed
// EG : void information(int a ) is not allowed in the above class



