public class AbstractionReview {
    public static void main(String[] args) {
        
    }
    
}
abstract class Computer {
    abstract void on (){
        System.out.println("I am running ");
    }
    abstract void off (){
        String changePassword (String message){
            System.out.println("change ");

        }
    }
class Mac extends Computer{

}
}
//Find the bug
public class AbstractionReview{
    public static void main(String[] args){
        // Computer c = new Computer();
    }
}
abstract class Computer{
    abstract void on();
    abstract void off();
    String changePasword(String message){
        System.out.println("Change");
    }
}
class Mac extends Computer{
    @Override
    void on(){
        // return "On";
    }

    @Override
    void off(){
        // logic
    }
}
