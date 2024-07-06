public class Abstraction {
    public static void main(String[] args) {
        Nokia n = new Nokia();
        Samsung s = new Samsung();
        Apple a = new Apple ();
        
    }
    
}
//to make abstract class keyword "abstract " before class
abstract class SmartPhone{
    //abstract class may or may not have abstract func 
    //to make abstract function add "abstract " before return type
    //abstract func do not have a body
    abstract void call();
    abstract void message();
    abstract String delivery (String text);

}
//abstract class cannot be instantiated /cannot make object
// use it in a sub class

class Nokia extends SmartPhone{
    // if we extend abstract class,we must override every 
    // abstract function in child class 
    @Override
    void call(){
        System.out.println("nokia calling");
    }
    @Override
    void message (){
        System.out.println("nokia messaging");
    }
    @Override
    String delivery (String text ){
        System.out.println("text delivered "+text);
        return "text deliverd";
    }
}

//make class Samsung and Apple that extends Smartphone 
//make object of Nokia , Samsung and Apple 
// call the func message and delivery 
//each with have their own implementation


class Samsung extends SmartPhone{
    @Override
    void call(){
        System.out.println("nokia calling");
    }
    @Override
    void message(){
        System.out.println("messaging");
    }
    @Override
    String delivery (String text ){
        System.out.println("text delivered "+text);
        return "text deliverd";
    }
}

class Apple extends SmartPhone{
    @Override
    void call(){
        System.out.println("nokia calling");
    }
    @Override
    void message(){
        System.out.println("messaging");
    }
    @Override
   String delivery (String text ){
        System.out.println("text delivered "+text);
        return "text deliverd";
    }
}