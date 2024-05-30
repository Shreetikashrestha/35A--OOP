public class ConstructorClasstask1 {
    public static void main(String[] args) { 
        ConstructorTwo ce = new ConstructorTwo ("shree",20);
        ce.info();
        
    }
    
}



    //make 2 private attribute name and age 
    //make constructor that sets both name and age 
    // make function info() ---> print (name and age )
    // make an object and run info () function
class ConstructorTwo{

    private String name ;
    private int age ;
    ConstructorTwo(String n , int a ){
        name = n ;
        age = a;
    }

    void info (){
        System.out.println(name + "and "+ age );
    }


    }

