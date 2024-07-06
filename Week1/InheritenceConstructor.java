public class InheritenceConstructor {

    public static void main(String[] args) {
        Polo p = new Polo();
        p.colorDifference("Red");
        //if constructor is overloaded , pass the corresponding params
        Shirt shirt1 = new Shirt(); // non param constructor
        Shirt shirt2 = new Shirt(10);//constructor that takes int 
        
    }
    
}
class Shirt {
    String color ="white";//super.color
    Shirt(){
        System.out.println("parent default ");
        
    }


//constructor overloading 
//same constructor /func with difference logic/params
Shirt (String color ){
    this.color=color;

}
Shirt (int price){
    System.out.println("price "+price);
}
Shirt(String color ,int price ){
    System.out.println("color and price "+ color +""+price);
}
}

class Polo extends Shirt {
    String color = "black ";//this.color
    Polo (){
        //the default constructor is run in first execution
        //super()i.e Shirt() is run automatically here 
        System.out.println("child default ");

    }

    void colorDifference (String color ){
        System.out.println("parameter color "+color );
        System.out.println("class color "+ this.color );
        System.out.println("parent color "+ super.color );
    }
}

