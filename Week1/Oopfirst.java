public class Oopfirst {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name ="Ram ";
        p1.age=10;
        p1.address= "ktm";
        p1.gender = 'M';

        p1.greet();


        Person p2 = new Person();
        p2.name ="Shree ";
        p2.age=20;
        p2.address= "sanepa";
        p2.gender = 'F';
        p2.greet();
        p2.sleep();
    }
}


class Person{
    String name ;
    int age ;
    String address;
    char gender;

    void greet(){
        System.out.println("Name "+name +"Age"+age);
    }
    void sleep (){
        System.out.println("person is sleeping ");
    }
}