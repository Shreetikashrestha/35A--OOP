public class InheritanceTask {
public static void main(String[] args) {
   labrador l = new labrador();
   l.name = "labra";
   l.legs=4;
   l.diet="churpi";
   l.color= "golden";
    l.size();
    l.barks();
    l.fur();
    l.speak();


}

    
}

class animal{
    public String name ;
    void speak(){
        System.out.println("the name of the animal is "+name );
    } 
}
class mammal extends animal{
    public int legs;
    void fur(){
        System.out.println(name +"has "+legs+"legs");
    }
}
class reptiles extends animal{
    public int eggs;
    void shed(){
        System.out.println(name+"lay"+eggs+"eggs");

    }
}
class amphibian extends reptiles{
    public int gills;
    void breathe(){
        System.out.println(name+"animal "+ "has"+ gills+"gills");
    }
}
class dog extends mammal{
    String diet;
    void barks(){
        System.out.println(name + diet);
    }
}

class cat extends mammal{
    void meow(){
        System.out.println(name );
    }
}

class labrador extends dog{
    String color;
    void size(){
        System.out.println(color+name+diet );
    }
}
class germanshephard extends mammal{
    String breed;
    void spotted(){
        System.out.println(breed + "breed");
    }
}