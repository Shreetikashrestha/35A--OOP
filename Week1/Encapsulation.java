public class Encapsulation {
    public static void main(String[] args) {
    Laptop l = new Laptop();
    l.name = "Apple M1";
    l.brand = "Apple ";
    l.setRam(8);
    l.setStorage (128);

    l.price= 150000;
    System.out.println("name "+ l.name );
    System.out.println("brand "+ l.brand );
    System.out.println("ram "+ l.getRam()+"gb" );
    System.out.println("storage "+ l.getStorage() +"gb");
    System.out.println("price"+l.price);
    l.upgrade(2, 128);
    l.inflation(20000);

    Laptop ll = new Laptop();
    }
}

//encapsulation bundle/group similar properties 
//and func  in a class 
class Laptop{
    //encapsulation /class contains attributes /properties
    String brand;
    public String name; 
    //2.encapsulation can contain data hiding 
    //can be done using the access modifier private 

    private int ram ;
    private int storage;
    double price;
    //and functions 
    void info(){
        System.out.println("brand "+ this.brand + "name "+this.name );

    }

    //3.encapsulation maintains better control read-only or write - only
    //using getter and setter 
    void setRam (int ram){
        this.ram= ram;
    }
    int getRam (){
        return this.ram;

    }


    //make setter and getter for storage 
    //make 2 object of Laptop
    //output from object 
    // name : Apple M1 
    // //brand : Apple 
    // Ram ; 8 gb 
    // storage  128 gb 
    // price 150000
    // make a func upgrade that takes a ram and storage
    // and add to the current ram and storage 
    // //make a func inflation that takes number 
    // and increase the price with given number
    void setStorage(int storage ){
        this.storage = storage;

    }
    int getStorage (){
        return this.storage;
    }

    void upgrade (int ram, int storage ){
        this.ram = this.ram+ ram;
        this.storage = this.storage +ram;
    }

    void inflation(double money){
        this.price +=money;
    }

   


}

