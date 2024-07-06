public class Interface {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.eat();
        Wolf w1 = new Wolf();
        w1.eat();

    }

}

// to make interface, use "interface "in replacement of class
interface AnimalDo {
    public void eat();

    public void travel();

}

// to use interface in another class use "implements "keyword
class Cow implements AnimalDo {
    // all the functions of interface is automatically
    // so override all the func
    @Override
    public void eat() {
        System.out.println("cow eats grass");
    }

    @Override
    public void travel() {
        System.out.println("cow travel on 4 legs ");
    }

}

class Wolf implements AnimalDo {
    @Override
    public void eat() {
        System.out.println("wolf eats meat");
    }

    @Override
    public void travel() {
        System.out.println("wolf travel on 4 legs");
    }
}

// extend "interface "
interface MammalDo extends AnimalDo {
    public int legs();
}

interface DogDo extends MammalDo {
    public String bark();
}

interface DomesticAnimal {
    public void pet();
}

// if implementinmg interface with is being nested / extended to another
// interface
// override all the function being passed down
// can implement multipple interface followed by ","
// vvi important note = a class can only extend one class but implements multiple interfaces

class Bulldog implements DogDo, DomesticAnimal {
    @Override
    public void pet() {
        System.out.println("petting");
    }

    @Override
    public int legs(){
        return 4;
    }

    @Override
    public void eat() {

    }

    @Override
    public void travel() {

    }

    @Override
    public String bark() {
        return "woof";
    }
}

